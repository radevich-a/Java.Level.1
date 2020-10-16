import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButtonListener implements ActionListener {
    private JTextField outField;
    private StringBuilder sb;
    ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
    ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");


    public ActionButtonListener(JTextField outField) {
        this.outField = outField;
        this.sb = new StringBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();

        String totalValue = sb.append(outField.getText())
                .append(jButton.getText())
                .toString();
        sb.setLength(0);

        if (jButton.getText().equals("C")){ totalValue = null;}

        if (jButton.getText().equals("Submit")){
            totalValue = outField.getText();

            Object result = null;

            result = scriptEngine.eval(totalValue);

            totalValue = (String) result;
        }
        outField.setText(totalValue);
    }
}
