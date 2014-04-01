public class ExamQuestions
{

/*
This is a very good question to test the concepts of execution flow 
in case of if conditions. The rule for attaching else statements with 
if conditions is the same as attaching close brackets with open brackets. 
A close bracket attaches with the closest open bracket, which is not already 
closed. Similarly an else statement attaches with the closest if statement,
which doesn't have an else statement already, attached to it. So the else 
statement at line 7 attaches to the if statement at line 6. The else statement 
at line 8 attaches to the if statement at line 5. The else statement at line 9 
attaches to the if statement at line 8. Now let's look at the execution. 
At line 4 since a is equal to true the execution falls to line 5. At line 5 
since b is not true the execution goes to the corresponding else statement at 
line 8. Now it evaluates the condition inside the if statement. Please note 
here that an assignment statement also has a value equal to the value being 
assigned, hence (b = c) evaluates to true and subsequently a 
(b = c) evaluates to true and &quot;It's too confusing to tell what is true 
and what is false&quot; will be printed. Hence the correct answer is choice D.
*/
private void trueOrFalse()
{
boolean a = true;  // 1
boolean b = false; // 2
boolean c = true;  // 3
if (a == true)
if (b == true)
if (c == true)            System.out.println("Some things are true in this world");
else                      System.out.println("Nothing is true in this world!");
else if (a && (b = c))    System.out.println("It's too confusing to tell what is true and what is false");
else                      System.out.println("Hey this won't compile");
}

private void trueOrFalse2()
{
boolean a = true;
boolean b = false;
boolean c = true;
if (a == true)  // line 4
	if (b == true) // line 5
		if (c == true) // line 6
			System.out.println("Some things are true in this world"); // 6
		else                      
			System.out.println("Nothing is true in this world!"); // 7
	else if (a && (b = c))    
		System.out.println("It's too confusing to tell what is true and what is false"); //8
	else                      
		System.out.println("Hey this won't compile"); // 9
}

private void StringBuilderQuestion()
{
	StringBuilder sb = new StringBuilder();
	//Which of the following are valid uses of the sb variable?
	sb.append(34.5);
	//sb.deleteCharAt(34.5);
	//c. sb.toInteger(3);
	sb.toString();
	int i = 5;
	int j = 10;
	while((i = 12)!=5) {break;};  // how does this work?  ahh, (12 != 5)
	//Given the following declaration of an array, which statement will display
	//each element of the array?
	int arr[] = {1,2,3,4,5};
	//for(int n : arr[]) { System.out.println(n); }System.out.println(n);
	System.out.println("b.");
	for(int n : arr) { System.out.print(n); }
		System.out.println();
	System.out.println("c.");
	for(int n=1; n < 6; n++) { System.out.println(arr[n]);}
	System.out.print("d.");	
	for(int n=1; n <= 5; n++) { System.out.println(arr[n]);}
}

public static void main(String args[]) 
{
	ExamQuestions qs = new ExamQuestions();
	qs.trueOrFalse();	
	qs.trueOrFalse2();
	qs.StringBuilderQuestion();	
}

}