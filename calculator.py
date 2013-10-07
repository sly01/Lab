__author__ = 'erkoc'

num1 = input("Please enter the first number=")

num2 = input("Please enter the second number=")

print "Please enter the operator one of them +,-,*,/"

choice = raw_input()
if choice=='+':
 print "Result=",num1+num2
elif choice=='-':
 print "Result=",num1-num2
elif choice=='*':
 print "Result=",num1*num2
elif choice=='/':
 print "Result=",num1/num2
else:
 print "Please enter the true operator"
 



