using System;

namespace _03EmployeeData
{
    class Program
    {
        static void Main(string[] args)
        {
            string empName = Console.ReadLine();
            int empAge = int.Parse(Console.ReadLine());
            int empID = int.Parse(Console.ReadLine());
            double empSalary = double.Parse(Console.ReadLine());

            Console.WriteLine($"Name: {empName}\nAge: {empAge}\nEmployee ID: {empID:d8}\nSalary: {empSalary:f2}");
        }
    }
}
