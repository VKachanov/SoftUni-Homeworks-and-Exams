using System;

namespace p15Calculator
{
    class Calculator
    {
        static void Main(string[] args)
        {
            int firstOperand = int.Parse(Console.ReadLine());
            char action = char.Parse(Console.ReadLine());
            int secondOperand = int.Parse(Console.ReadLine());

            int result = 0;

            switch (action)
            {
                case '+':
                    result = firstOperand + secondOperand;
                    break;
                case '-':
                    result = firstOperand - secondOperand;
                    break;
                case '*':
                    result = firstOperand * secondOperand;
                    break;
                case '/':
                    result = firstOperand / secondOperand;
                    break;
            }
            Console.WriteLine($"{firstOperand} {action} {secondOperand} = {result}");
        }
    }
}
