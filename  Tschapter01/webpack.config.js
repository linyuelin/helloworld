const path = require('path');

// htmlプラグインをインポート
const HTMLWebpackPlugin = require('html-webpack-plugin');

//自動的に削除する
const {CleanWebpackPlugin} = require('clean-webpack-plugin');

module.exports = {
    mode: 'development',
    
    //こちらから読み込む
    entry: "./src/index.ts",
    
    // どちらにコンパイルかを指定する
    output:{
        //パッケージされたファイルのフォルダ
        path: path.resolve(__dirname, 'dist'),
         
        //パッケージされたフィルムの名前
        filename: "bundle.js",

        environment: {
            arrowFunction: false
        }


    },
     
    //webpackでパッケージする際の所用のモジュールを決める
    module : {
        //規則
        rules: [
            {     
                 // 対象ファイル
                 test: /\.ts$/,

                 //ローダーを設定する
                 use: [
                    // babel
                    {
                        loader: "babel-loader",
                        options: {
                            presets: [
                                ["@babel/preset-env", {
                                    // ターゲット設定・　ブラウザ対応
                                    targets: {
                                        "chrome" : "88" ,//バージョンを指定する
                                        "ie":"11"
                                    },
                                    //corejsのバージョン
                                    "corejs":"3",
                                    //必要なポリファイルのみを使用する
                                    "useBuiltIns":"usage"
                                }]
                            ]
                        }
                    },
                    'ts-loader',
                ],
                

                 
                 //除外するファイル
                 exclude:/node-modules/
            }
        ]
    },
     
    // webpack のプラグインを設定する
    plugins: [

        new CleanWebpackPlugin(),

        new HTMLWebpackPlugin({
            // title:"オリジナルなタイトル"
            template: "./src/index.html"
        }),
    ],

    resolve: {
        extensions: ['.ts' ,'.js']
    }




    
      

}