package bmi.bmr;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField height;

    @FXML
    private TextField weight;
    
     @FXML
    private TextField age;

    @FXML
    private TextField bmiresult;

    @FXML
    private TextField bmistatus;

    @FXML
    private TextField bmrresult;
    
     @FXML
    private TextField feet;

    @FXML
    private TextField inch;
    
    
    @FXML
    void convertmetre(ActionEvent event) {
        double f = Double.parseDouble(feet.getText());
        double i = Double.parseDouble(inch.getText());
        double m = ((f*12)+i)*0.0254;
        
        String me = String.format("%.4f",m);
        height.setText(me);

    }

    @FXML
    void calculatefemale(ActionEvent event) {
        double h = Double.parseDouble(height.getText());
        double w = Double.parseDouble(weight.getText());
        double a = Double.parseDouble(age.getText());
        
        double bmi = w / (h*h);
        double bmr = 655 + (9.6*w)+(1.8*100*h)-(4.7*a);
        
        String cal = String.format("%.3f",bmi);
         bmiresult.setText(cal);
        String cal2 = String.format("%.3f",bmr);
         bmrresult.setText(cal2);
         
         if (bmi<18.8)
         {
             bmistatus.setText("UnderWeight");
         }
         else if (bmi<25)
         {
             bmistatus.setText("Normal Weight");
         }
         else if (bmi<30)
         {
             bmistatus.setText("Pre-Obesity");
         }
         else if (bmi<35)
         {
             bmistatus.setText("Obesity Class-I");
         }
         else if (bmi<40)
         {
             bmistatus.setText("Obesity Class-II");
         }
         else if (bmi>40)
         {
             bmistatus.setText("Obesity Class-III");
         }         
    }

    @FXML
    void calculatemale(ActionEvent event) {
        double h = Double.parseDouble(height.getText());
        double w = Double.parseDouble(weight.getText());
        double a = Double.parseDouble(age.getText());
        
        double bmi = w / (h*h);
        double bmr = 66 + (13.7*w)+(5*100*h)-(6.8*a);
        
        String cal = String.format("%.3f",bmi);
         bmiresult.setText(cal);
        String cal2 = String.format("%.3f",bmr);
         bmrresult.setText(cal2);
         
         if (bmi<18.8)
         {
             bmistatus.setText("UnderWeight");
         }
         else if (bmi<25)
         {
             bmistatus.setText("Normal Weight");
         }
         else if (bmi<30)
         {
             bmistatus.setText("Pre-Obesity");
         }
         else if (bmi<35)
         {
             bmistatus.setText("Obesity Class-I");
         }
         else if (bmi<40)
         {
             bmistatus.setText("Obesity Class-II");
         }
         else if (bmi>40)
         {
             bmistatus.setText("Obesity Class-III");
         }
    }

    @FXML
    void clear(ActionEvent event) {
        height.setText("");
        weight.setText("");
        bmiresult.setText("");
        bmistatus.setText("");
        bmrresult.setText("");
        age.setText("");
        feet.setText("");
        inch.setText("");
    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
