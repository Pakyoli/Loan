
package hwk2;
import javax.swing.*;

public abstract class Loan implements LoanConstants{
    
    private String loanNum, lastName,loanType;
    private double amount, interest, term;
    
    public Loan(){
        loanNum = "001";
        lastName = "Brown";
        amount = 100000;
        term = 1;
    }
    
    
    public String getLoanNum(){
        return loanNum;
    }
    public String getLastName(){
        return lastName;
    }
    public String getLoanType(){
        return loanType;
    }
    
    public double getAmount(){
        return amount;
    }
    public double getTerm(){
        return term;
    }
    public void setLoanNum(String num){
        loanNum = num;
    }
    public void setLastName(String ln){
        lastName = ln;
    }
    public  void setLoanType(String type){
        loanType = type;
    }
    public void setAmount(double a){
        if (a>0 && a<=100000)
            amount = a;
        else{         
            JOptionPane.showMessageDialog(null,"Loan amount is over limit.","Input error",JOptionPane.ERROR_MESSAGE );
            setAmount(Double.parseDouble(JOptionPane.showInputDialog("Please re-enter:")));
        }
            
    }
    public void setTerm(double t){
        if (t!=LoanConstants.st && t!=LoanConstants.mt && t!=LoanConstants.lt)
            t = 1;
        term = t;
    }
    
    public double getInterest(){
        return interest ;
    }
    public void setInterest(double pi){
        interest = pi;
    }
    
    @Override
    public String toString(){
        
        return lastName + " has a " + term +"-year " + loanType + " loan of $" + amount + 
                " with interest rate of " + getInterest()*100 + "%. The loan number is " + 
                loanNum +".";
    }
}
