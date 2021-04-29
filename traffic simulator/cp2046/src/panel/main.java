package panel;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class main extends Application{
	
	public static void main(String[] args)
	{
	   launch(args);	
	}
	
	@Override
	public void init() throws Exception {
		
		System.out.println("init");	
	}


    
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Traffic Simulation");
		primaryStage.getIcons().add(new Image("/image/car.jpeg"));
// 		primaryStage.setIconified(true);
//    	primaryStage.setMaximized(true);
//		primaryStage.setWidth(960);
//		primaryStage.setHeight(600);
		primaryStage.heightProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observableValue, Number oldvalue, Number newvalue) {
			System.out.println("height="+newvalue.intValue());
				
			}
		});
//		primaryStage.setFullScreen(true);
		VBox vb =new VBox();
		
		
		FXMLLoader fx= new FXMLLoader();
//		AnchorPane root=(AnchorPane)fx.load(new FileInputStream(new File("D:/java/workspace/panel/src/panel/panel.fxml")));
		
		URL url=fx.getClassLoader().getResource("panel/panel.fxml");
		fx.setLocation(url);
		VBox root=(VBox)fx.load();
		
		
		Scene scene=new Scene(root); 
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	
	@Override
	public void stop() throws Exception {
		
		System.out.println("stop");
	}
	

}
