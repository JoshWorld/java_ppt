package lesson09;

public class MyPoint {

	int x;
	int y;
	public MyPoint(){
		this.x = 0;
		this.y = 0;
	}
	public MyPoint(int px, int py){
		if(px > 0 && px < 100){
			this.x = px;
		}
		if(py > 0 && py < 100){
			this.y = py;
		}
	}
	public int getX() {
		return x;
	}
	public void setX(int px) {
		if(px > 0 && px < 100){
			this.x = px;
		}
	}
	public int getY() {
		return y;
	}
	public void setY(int py) {
		if(py > 0 && py < 100){
			this.y = py;
		}
	}
}
