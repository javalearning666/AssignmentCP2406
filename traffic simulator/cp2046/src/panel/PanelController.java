package panel;


import java.io.File;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.Button;

public class PanelController<Layer> {
	
	public PanelController  () {
		
	}
	
	@FXML
	private VBox vb;
	
	@FXML
	private Menu m1;
	
	@FXML
	private MenuItem m1n;
	
	@FXML
	private void create() {
		
		Stage stage=new Stage();
		FileChooser filechooser= new FileChooser();
		filechooser.showSaveDialog(stage);
		System.out.println("open");
		
	}
	
	@FXML
	private MenuItem m1o;
	
	@FXML
	private void open() {
		
		Stage stage=new Stage();
		FileChooser filechooser= new FileChooser();
		filechooser.getExtensionFilters().add(new ExtensionFilter(".map","*.*" ));
		filechooser.showOpenDialog(stage);
		System.out.println("open");
		
	}
	
	@FXML
	private MenuItem m1s;
	
	@FXML
	private void save() {
		
		Stage stage=new Stage();
		FileChooser filesave= new FileChooser();
		filesave.setInitialFileName("*");
		filesave.getExtensionFilters().add(new ExtensionFilter(".map","*.*" ));
		
		File file=filesave.showSaveDialog(stage);
		
		if(file==null)
		{
			return;
		}
		
		
		
//		System.out.println("save");
		
	}
	
	@FXML
	private MenuItem m1sa;
	
	@FXML
	private void saveas() {
		
		Stage stage=new Stage();
		FileChooser filesave= new FileChooser();
		filesave.setInitialFileName("*");
		filesave.setInitialDirectory(new File("d:"+File.separator));
		filesave.getExtensionFilters().add(new ExtensionFilter(".map","*.*" ));
		
		File file=filesave.showSaveDialog(stage);
		
		if(file==null)
		{
			return;
		}
		
		
		
//		System.out.println("saveas");
		
	}
	
	@FXML
	private MenuItem m1q;
	
	@FXML
     private void quit() {
		
		System.exit(0);
		
	}
	
	@FXML
	private Menu m2;
	
	@FXML
	private MenuItem m2r;
	
	@FXML
	private MenuItem m2s;
	
	@FXML
	private MenuItem m2sur;
	@FXML
    private void sur() {
		
		m2sur.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				
				TextInputDialog in= new TextInputDialog("Input Update Rate Here");
				in.show();
				
				
			}
		});
		
	}
	
	@FXML
	private MenuItem m2scs;
	@FXML
     private void scs() {
		
		m2scs.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				
				TextInputDialog in= new TextInputDialog("Setup Car Speed Here");
				in.show();
				
				
			}
		});
		
	}
	
	
	
	
	
	
	@FXML
	private Pane p1;
	
	@FXML
	private Pane p2;
	
	@FXML
	private Pane p3;
	
	@FXML
	private Pane p4;
	
	@FXML
	private Shape red;
	
	@FXML
	private Shape green;
	
	
	@FXML
	public void drag() {
		
		p1.setOnMouseDragged(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				AnchorPane.setLeftAnchor(p1, event.getSceneX());
				AnchorPane.setTopAnchor(p1, event.getSceneY());
				System.out.println("");
				
				
			}
			
		});
		
	}
	
	@FXML
	public void drag2() {
		
		p2.setOnMouseDragged(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				AnchorPane.setLeftAnchor(p2, event.getSceneX());
				AnchorPane.setTopAnchor(p2, event.getSceneY());
				System.out.println("");
				
				
			}
			
		});
		
	}
	
	@FXML
	public void drag3() {
		
		p3.setOnMouseDragged(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				AnchorPane.setLeftAnchor(p3, event.getSceneX());
				AnchorPane.setTopAnchor(p3, event.getSceneY());
				System.out.println("");
				
				
			}
			
		});
		
	}
	
	@FXML
	public void drag4() {
		
		p4.setOnMouseDragged(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				AnchorPane.setLeftAnchor(p4, event.getSceneX());
				AnchorPane.setTopAnchor(p4, event.getSceneY());
				System.out.println("");
				
				
			}
			
		});
		
	}
	
	
	
	@FXML
	public void rotate() {
		
		Rotate rotate=new Rotate(90,54,54);
		p1.getTransforms().add(rotate);
	}
	
	
	@FXML
	public void rotate3() {
		
		Rotate rotate3=new Rotate(90,54,54);
		p3.getTransforms().add(rotate3);
	}
	
	
	
	@FXML
	public void rotate4() {
		
		Rotate rotate4=new Rotate(90,19,8);
		p4.getTransforms().add(rotate4);
	}
	

	
	
	
	
	
	
	
	
	@FXML
    private void initialize() {
		
	}
	
	
	
	
}
