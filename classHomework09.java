public class classHomework09{
	public static void main(String [] args) {
		Music m =new Music("天下" ,300);
		m.play();
		System.out.println(m.getInfo());
	}
}
class Music{
	//题目：定义music类，里面有音乐名name，音乐时长times属性，
	//并有播放paly功能和返回本身属性信息的功能方法getinfo
	String name;
	int times;
	
	public Music(String name, int times) {
		this.name = name;
		this.times =times;
		
	}
	public void play() {
		System.out.println("音乐" + name + "正在播放中" + "时长为" + times + "秒");
	}
	public String getInfo(){
	   return "音乐名" + name + "时长" + times;	
	}
}