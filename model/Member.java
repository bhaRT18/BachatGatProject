package model;
import java.time.LocalDate;
                               /*member class represents a womannparticipating in the bachat gat group
                                * it holds personal details and financial summary related to the member.
                                */
 public class Member{
                              //personal information//
 String memberName;
 String memberId;
 String mobileNumber;
 String address;
 LocalDate dteOfJoining;
 String aadharNumber;
                                    //Monthly contribution detail//
 double monthlyContribution;
 double totalDeposit;
                                       //Loan and repayment summary
 double loanTaken;
 double loanRepaid;
 double interestPaid;
 boolean isActive;
                                       //constructor//
public Member(String memberName, String memberId,String mobileNumber,String address,
LocalDate dteOfJoining,String aadharNumber,double monthlyContribution,
double totalDeposit,double loanTaken,double loanRepaid,double interestPaid,
boolean isActive){
    this.memberName=memberName;
    this.memberId=memberId;
     this.mobileNumber=mobileNumber;
     this.address=address;
     this.dteOfJoining=dteOfJoining;
     this.aadharNumber=aadharNumber;
     this.monthlyContribution=monthlyContribution;

     this. totalDeposit= 0.0;
     this.loanTaken=0.0;;
     this.loanRepaid=0.0;
     this. interestPaid= 0.0;
     this.isActive=true;
} 
//getters//
public String getMemberName(){ return memberName; }
public String getMemberId(){ return memberId; }
public String getmobileNumber(){ return mobileNumber; }
public String getaddress(){ return address; }
public  LocalDate getdateOfJoining(){ return dteOfJoining; }
public String getaadharNumber(){return aadharNumber; }
public double getmonthlyContribution(){return monthlyContribution; }
public double gettotalDeposit(){return totalDeposit; }
public double getloanTaken(){return loanTaken; }
public double getloanRepaid(){ return loanRepaid;}
public double getinterestPaid(){ return interestPaid; }
public boolean isActive(){return isActive; }
//setters / update methods 
public void addDeposit(double amount){
    this.totalDeposit+=amount;
}
public void takenLoan(double amount){
    this.loanTaken+=amount;
}
public void repayLoan(double amount){
    this.loanRepaid+=amount;
}
public void payInterest(double amount){
    this.interestPaid+=amount;
}
public void setActive(boolean active){
    this.isActive=active;
}
//utility//
public double getOutstandingLoan(){
    return loanTaken-loanRepaid;
}







    


}