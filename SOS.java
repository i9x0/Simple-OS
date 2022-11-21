package projecto1;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class SOS {

    public static Process[] processes = new Process[10];

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            int n = rand.nextInt(899) + 100;
            Process p = new Process();
            p.setProcessID(n);
            p.setProcessName("Process" + i);
            p.setStatus("Ready");
            processes[i] = p;
        }
        chooess();
    }

    public static void changerunning(int convert){
        processes[convert].setStatus("Running");
    }

    public static void changeready(int convert){
        processes[convert].setStatus("Ready");
    }

    public static void showProcess() throws IOException {
        System.out.println("====================");
        System.out.println(".. Current Info ..");
        System.out.println("==========================================================================");
        for (int i = 0; i < 10; i++) {
            System.out.println("Name : " + processes[i].getProcessName() + "\t|\tID : "
                    + processes[i].getProcessID() + "\t|\tProcess status : " + processes[i].getStatus());
            System.out.println("==========================================================================");
        }
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("If you want to kill tasks enter number 1 other wise enter 0 : ");
        int x = in.nextInt();
        System.out.println();

        if (x == 1) {
            System.out.print("Enter the procsseses numbers you want to kill : ");
            String j = in.next();
            System.out.println();
            for (int i = 0; i < j.length(); i++) {

                String t = String.valueOf(j.charAt(i));
                int tint = Integer.parseInt(t);
                switch (tint) {
                    case 0:
                        Runtime.getRuntime().exec("taskkill /F /IM cleanmgr.exe");
                        break;
                    case 1:
                        Runtime.getRuntime().exec("taskkill /F /IM notepad.exe");
                        break;
                    case 2:
                        Runtime.getRuntime().exec("taskkill /F /IM mspaint.exe");
                        break;
                    case 3:
                        Runtime.getRuntime().exec("taskkill /F /IM excel.exe");
                        break;
                    case 4:
                        Runtime.getRuntime().exec("taskkill /F /IM onenote.exe");
                        break;
                    case 5:
                        Runtime.getRuntime().exec("taskkill /F /IM WINWORD.exe");
                        break;
                    case 6:
                        Runtime.getRuntime().exec("taskkill /F /IM POWERPNT.exe");
                        break;
                    case 7:
                        Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
                        break;
                    case 8:
                        Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");
                        break;
                    case 9:
                        Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
                        break;
                    default:
                        System.out.println("incorret number Please enter number between 0 to 9 ");
                        break;
                }
                changeready(tint);
            }
            chooess();
        } else {
            chooess();
        }
    }

    public static void chooess() throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.println("1 - Current Processes Status ");
        System.out.println("2 - View Apps ");
        System.out.println("3 - Developers ");
        System.out.println("4 - Exit ");
        System.out.println();
        System.out.print("Your Pick : ");
        int choise = in.nextInt();
        System.out.println();

        switch (choise) {
            case 1:
                showProcess();
                break;
            case 2:
                System.out.println("0  to  Run  Clean Disk");
                System.out.println("1  to  Run  Note Pad");
                System.out.println("2  to  Run  Paint");
                System.out.println("3  to  Run  Excel");
                System.out.println("4  to  Run  One Note");
                System.out.println("5  to  Run  Word");
                System.out.println("6  to  Run  Power point ");
                System.out.println("7  to  Run  Chrome");
                System.out.println("8  to  Run  Internet Explorer");
                System.out.println("9  to  Run  Command Line");

                String convert = in.next();
                System.out.println();
                System.out.println();
                for (int i = 0; i < convert.length(); i++) {
                    String t = String.valueOf(convert.charAt(i));
                    int tint = Integer.parseInt(t);

                    switch (tint) {
                        case 0:
                            Runtime.getRuntime().exec(" cmd /c start cleanmgr.exe  ");
                            break;

                        case 1:
                            Runtime.getRuntime().exec(" cmd /c start notepad.exe  ");
                            break;

                        case 2:
                            Runtime.getRuntime().exec("cmd /c start mspaint.exe ");
                            break;

                        case 3:
                            Runtime.getRuntime().exec("cmd /c start excel.exe");
                            break;

                        case 4:
                            Runtime.getRuntime().exec("cmd /c start onenote.exe");
                            break;
                        case 5:
                            Runtime.getRuntime().exec("cmd /c start WINWORD.exe");
                            break;
                        case 6:
                            Runtime.getRuntime().exec("cmd /c start POWERPNT.exe");
                            break;
                        case 7:
                            Runtime.getRuntime().exec("cmd /c start chrome.exe");
                            break;
                        case 8:
                            Runtime.getRuntime().exec("cmd /c start iexplore.exe");
                            break;
                        case 9:
                            Runtime.getRuntime().exec("cmd /c start cmd.exe  ");
                            break;

                        default:
                            System.out.println(" incorret number Please enter number between 0 to 9 ");
                    }
                    changerunning(tint);
                }
                chooess();

            case 3:
                System.out.println(" Dev By Abdullah");
                chooess();
                break;
            case 4:
                System.out.println("Shutdown");
                break;

            default:
                System.out.println(" no function  enter number between 1 to 4 ");
                break;
        }
    }
}