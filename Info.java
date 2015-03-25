import javax.swing.JOptionPane;

public class Info {

        public static void main(String[]args){

                String user = "sinaabd";
                String pass = "1996426";
                String entered_user = "";
                String entered_pass = "";

                while(entered_user.equals(user) == false || entered_pass.equals(
pass) == false){

                        entered_user = JOptionPane.showInputDialog("Enter userna
me");
                        entered_pass = JOptionPane.showInputDialog("Enter passwo
rd");

                        String[] choices = {"Admin", "Student", "Staff"};
                        String input = (String) JOptionPane.showInputDialog(null
, "Choose account type ","Account Type", JOptionPane.QUESTION_MESSAGE, null,choi
ces,choices[1]);

			System.out.println(input);
}
}
}