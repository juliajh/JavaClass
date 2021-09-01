import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

public class TextDecorator extends TshirtsDecorator {

	String text;
	Graphics2D g2;
	int count=0;
	Color color;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TextDecorator(Tshirt decoratedTshirt) {
		super(decoratedTshirt);
		this.text="I LOVE YOU";
	}
	
	public void paintComponent(Graphics g) {
		super.decoratedTshirt.paintComponent(g); 
		g2 = (Graphics2D) g;
		g2.drawImage(super.decoratedTshirt.image, 0, 0, WIDTH, HEIGHT, this);  //tshirt draw
		g2.setFont(new Font("�ü�",Font.BOLD,20));  //�۾�ü ���� set
		if(count==0) {
			color=settext(this);
			count++;
		}
		g2.setColor(color);
		g2.drawString(text,240,240);  //deco draw

	}
	
    public Color settext(TextDecorator t) {
    	Scanner scanner=new Scanner(System.in);
    	String text=t.getText();
    	System.out.println("Select the color of the text(number): Pink(1) Blue(2) Yellow(3)");
    	int num=Integer.parseInt(scanner.next());
    	Color color = null;
    	if(num==1) {
    		color=Color.PINK;
    	}
    	else if(num==2) {
    		color=Color.BLUE;
    	}
    	else if(num==3) {
    		color=Color.YELLOW;
    	}
    	return color;
    	
    }
    
	@Override
	public String getDescription() {
		return super.decoratedTshirt.getDescription()+"Text ";  //decoratedTshirt.getDescription->������ ���� text �θ���
	}
	
	@Override
	public double cost() {
		return super.decoratedTshirt.cost()+25;  //decoratedTshirt.cost()->������ �� �θ���
	}


}
