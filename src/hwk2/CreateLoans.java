

package hwk2;

import javax.swing.JOptionPane;


public class CreateLoans {
    double primeInt = 0.035;
    Loan [] loan = new Loan[5];
    BusinessLoan loan1 = new BusinessLoan();
    BusinessLoan loan2 = new BusinessLoan();
    PersonLoan loan3 = new PersonLoan();
    PersonLoan loan4 = new PersonLoan();
    BusinessLoan loan5 = new BusinessLoan();
    
    public CreateLoans(){
        JOptionPane.showMessageDialog(null, "The current prime interest rate is: " + primeInt*100 + "%");
         
        // loan #1
        loan1.setLoanType("Business Loan");
        loan1.setLoanNum("B01");
        loan1.setLastName(JOptionPane.showInputDialog("Please enter your last name"));
        loan1.setAmount(Double.parseDouble(JOptionPane.showInputDialog("How much do you want to borrow?")));
        loan1.setTerm(Double.parseDouble(JOptionPane.showInputDialog("How long is your loan?")));
        
        loan[0] = loan1;
        //loan #2
        loan2.setLoanType("Business Loan");
        loan2.setLoanNum("B02");
        loan2.setLastName(JOptionPane.showInputDialog("Please enter your last name"));
        loan2.setAmount(Double.parseDouble(JOptionPane.showInputDialog("How much do you want to borrow?")));
        loan2.setTerm(Double.parseDouble(JOptionPane.showInputDialog("How long is your loan?")));
        
        loan[1] = loan2;
        //loan #3
        loan3.setLoanType("Person Loan");
        loan3.setLoanNum("P01");
        loan3.setLastName(JOptionPane.showInputDialog("Please enter your last name"));
        loan3.setAmount(Double.parseDouble(JOptionPane.showInputDialog("How much do you want to borrow?")));
        loan3.setTerm(Double.parseDouble(JOptionPane.showInputDialog("How long is your loan?")));
        
        loan[2] = loan3;
        //loan #4
        loan4.setLoanType("Person Loan");
        loan4.setLoanNum("P01");
        loan4.setLastName(JOptionPane.showInputDialog("Please enter your last name"));
        loan4.setAmount(Double.parseDouble(JOptionPane.showInputDialog("How much do you want to borrow?")));
        loan4.setTerm(Double.parseDouble(JOptionPane.showInputDialog("How long is your loan?")));
        
        loan[3] = loan4;
        //loan #5
        loan5.setLoanType("Business Loan");
        loan5.setLoanNum("B03");
        loan5.setLastName(JOptionPane.showInputDialog("Please enter your last name"));
        loan5.setAmount(Double.parseDouble(JOptionPane.showInputDialog("How much do you want to borrow?")));
        loan5.setTerm(Double.parseDouble(JOptionPane.showInputDialog("How long is your loan?")));
        
        loan[4] = loan5;

        for(int i =0; i<loan.length; i++)
            JOptionPane.showMessageDialog(null, loan[i]);
        
    }
}
