import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameFrame(){
		//GamePanel panel = new GamePanel(); Posso usar um atalho no lugar de criar uma nova instancia e colocar o paramentro: this.add(panel)
		
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}

}
 