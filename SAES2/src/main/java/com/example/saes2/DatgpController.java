
package com.example.saes2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.example.saes2.model.Subject;

/**
 * FXML Controller class
 *
 * @author migue
 */
public class DatgpController implements Initializable {
    @FXML
    private Label c3;

    @FXML
    private Label cf;

    @FXML
    private Label grupo;

    @FXML
    private Label materia;

    @FXML
    private Label c1;

    @FXML
    private Label c2;
    /**
     * Initializes the controller class.
     */
    
    public void setData(Subject subject)
    {
        grupo.setText(subject.getArea());
        materia.setText(subject.getName());
        c1.setText(Integer.toString(subject.getCalif1()));
        c2.setText(Integer.toString(subject.getCalif2()));
        c3.setText(Integer.toString(subject.getCalif3()));
        cf.setText(Integer.toString(subject.getFinalScore()));
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
