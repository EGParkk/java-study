package windowProgramming;

public class Window {
	private int width; // 가로
	private int height; // 세로
	private boolean isVisible; // 현재 보이는가?
	private int top; // 위치
	private int left; // 위치
	
	//get, set 메소드 만들기
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setVisible(boolean visible) {
		isVisible = visible;
	}
	
	public void setTop(int top) {
		this.top = top;
	}
	
	public void setLeft(int left) {
		this.left = left;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public boolean getVisible() {
		return isVisible;
	}
	
	public int getTop() {
		return top;
	}
	
	public int getLeft() {
		return left;
	}
}
