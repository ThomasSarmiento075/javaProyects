public class relationalOperatorsExample3{
public static void main(String[] args){
double recommendedWaterIntake=8;
double daysInChallenge=30;
double yourWaterIntake=235.5;
double totalRecommendeAmount=recommendedWaterIntake*daysInChallenge;
boolean isChallengeComplete= yourWaterIntake>=totalRecommendeAmount;
System.out.println(isChallengeComplete);
}
}