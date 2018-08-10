import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;

public class Main extends JFrame implements Runnable {
	public class grid{
		public cell cells[][]; 
		private grid(int x, int y) {
			this.cells= new cell[x][y];
		}
		
	}
	public class cell{
		
	}
  private class Canvas extends JPanel {
    public Canvas() {
      setPreferredSize(new Dimension(1280, 720));
    }
    @Override
    public void paint(Graphics g) {
    	grid newGrid = new grid(20,20);
    	int cellSize=35;
    	for(int i=0; i<newGrid.cells.length;i++) {
    		for(int y=0;y<newGrid.cells[0].length;y++) {
    			
    			g.drawRect(10+i*35, 10+y*35, 35, 35);
    			
    			
    		}
    	}
    }
  }
  
  
  public static void main(String[] args) {
    Main window = new Main();
    window.run();
  }

  private Main() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(new Canvas());
    this.pack();
    this.setVisible(true);
  }

  @Override
  public void run() {
    this.repaint();
  }
}