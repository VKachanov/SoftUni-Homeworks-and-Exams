using System;

namespace p06_Notifications
{
    class Notifications
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                string result = Console.ReadLine();

                switch (result)
                {
                    case "success":
                        string operation = Console.ReadLine();
                        string message = Console.ReadLine();

                        Console.WriteLine(ShowSuccess(operation, message));
                       
                        break;
                    case "error":
                        operation = Console.ReadLine();
                        int code = int.Parse(Console.ReadLine());

                        Console.WriteLine(ShowError(operation, code));
                        
                        break;

                    default:
                        continue;
                }
            }
        }

        static string ShowSuccess(string operation, string message)
        {
            return $"Successfully executed {operation}.\r\n==============================\r\nMessage: {message}.";
            
        }

        static string ShowError(string operation, int code)
        {
            string reason = string.Empty;

            if (code > 0)
            {
                reason = "Invalid Client Data";
            }
            else
            {
                reason = "Internal System Failure";
            }
            return
                $"Error: Failed to execute {operation}.\r\n==============================\r\nError Code: {code}.\r\nReason: {reason}.";
        }

    }
}
