import java.util.Scanner;
import java.util.Random;

public class Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t ** All in one calculator. ** ");
        System.out.println("\nChoose options :- ");
        System.out.println("1 for Simple Calculator.");
        System.out.println("2 for Basic Converters.");
        System.out.println("3 for Diatance converstions.");
        System.out.println("4 for HCF and LCM.");
        System.out.println("5 for Odd and Even.");
        System.out.println("6 for Electricity Bill Calculator.");
        System.out.println("7 for Simple Interest Calculator.");
        System.out.println("8 for Discount Calculator.");
        System.out.println("9 for CGPA Calculator.");
        System.out.println("10 for Geometry Calculator.");
        System.out.println("11 for leap year finder.");
        System.out.println("12 for Two points distance calculator.");
        System.out.println("13 for Commission Calculator.");
        System.out.println("14 for Depreciation Calculator.");
        System.out.println("15 for Finding Batting Average.");
        System.out.println("16 for Compound Interest.");
        System.out.println("17 for Marks Average.");
        System.out.println("18 for Permutation and Combination.");
        System.out.println("19 for Finding Vovels in String.");
        System.out.println("20 for Checking number is Perfect or not.");
        System.out.println("21 for Sum of digit of number.");
        System.out.println("22 for Two Matrix Addtion.");
        System.out.println("23 for Income Tax Calculator.");
        System.out.println("24 for Finding Website type");
        System.out.println("25 for Printing table of a number.");
        System.out.println("50 for Rock Paper Scissor Game");
        System.out.print("Enter your choice : ");
        int process = input.nextInt();

        process(process);
    }

    static void process(int process) {
        if(process == 1) {
            calculator();
        }

        else if(process == 2) {
            converters();
        }

        else if(process == 3) {
            distance();
        }

        else if(process == 4) {
            hcf_lcm();
        }

        else if(process == 5) {
            odd_even();
        }

        else if(process == 6) {
            ele_bill();
        }

        else if(process == 7) {
            simple_inter();
        }

        else if(process == 8) {
            discount();
        }

        else if(process == 9) {
            CGPA();
        }

        else if(process == 10) {
            geometry();
        }

        else if(process == 11) {
            leap();
        }

        else if(process == 12) {
            point_distance();
        }

        else if(process == 13) {
            commission();
        }

        else if(process == 14) {
            depreciation();
        }

        else if(process == 15) {
            batting();
        }

        else if(process == 16) {
            compound();
        }

        else if(process == 17) {
            marks();
        }

        else if(process == 18) {
            pnc();
        }

        else if(process == 19) {
            vovels();
        }

        else if(process == 20) {
            perfect();
        }

        else if(process == 21) {
            sum_of_digit();
        }

        else if(process == 22) {
            two_matrix_add();
        }

        else if(process == 23) {
            income_tax();
        }

        else if(process == 24) {
            web_type();
        }

        else if(process == 25) {
            table();
        }

        else if(process == 50) {
            rock_paper_game();
        }
    }

    static void calculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nChoose options :- ");
        System.out.println("+ for Addition");
        System.out.println("- for Subtraction");
        System.out.println("* for Multiplication");
        System.out.println("/ for Division");
        System.out.println("p for Power");
        System.out.print("Enter your choice : ");
        char operation = sc.next().trim().charAt(0);

        if(operation == '+') {
            int sum = 0;
            System.out.print("\nEnter the no. of numbers to be taken : ");
            int add = sc.nextInt();

            for(int i=1; i<=add; i++) {
                System.out.print("Enter the " + i + " element : ");
                int add_num = sc.nextInt();
                sum += add_num;
            }
            System.out.println("The sum of the number is = " + sum);
        }

        else if(operation == '-') {
            System.out.print("\nEnter the first number : ");
            int min_num1 = sc.nextInt();
            System.out.print("Enter the second number : ");
            int min_num2 = sc.nextInt();

            int sub = min_num1 - min_num2;
            System.out.println("The subtraction of number is = " + sub);
        }

        else if(operation == '*') {
            int pro = 1;
            System.out.print("\nEnter the no. of number to be taken : ");
            int mul = sc.nextInt();

            for(int i=1; i<=mul; i++) {
                System.out.print("Enter the " + i + " element : ");
                int pro_num = sc.nextInt();
                pro *= pro_num;
            }
            System.out.println("The multiplication of the number is = " + pro);
        }

        else if(operation == '/') {
            System.out.print("\nEnter the first number : ");
            double Div_num1 = sc.nextInt();
            System.out.print("Enter the second number : ");
            double Div_num2 = sc.nextInt();

            double div = Div_num1 / Div_num2;
            System.out.println("The division of number is = " + div);
        }

        else if(operation == 'p') {
            System.out.print("\nEnter the number : ");
            int pow_num = sc.nextInt();
            System.out.print("Enter the power : ");
            int pow = sc.nextInt();
            
            int actual = pow;
            int power = 1;
            while(pow != 0) {
                power *= pow_num;
                --pow;
            }

            System.out.println(pow_num + " to the power " + actual + " is = " + power);
        }
    }

    static void converters() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nChoose options :- ");
        System.out.println("A for Temperature");
        System.out.print("Enter your choice : ");
        char operation = sc.next().trim().charAt(0);

        if(operation == 'A' || operation == 'a') {
            System.out.println("\nEnter the type of converstion :- ");
            System.out.println("A for celsius to fahrenheit.");
            System.out.println("B for fahrenheit to celsius.");
            System.out.print("Enter the option : ");
            char type = sc.next().trim().charAt(0);

            if(type == 'A' || type == 'a') {
                System.out.print("\nEnter the temperature in celsius : ");
                float c_temp = sc.nextFloat();

                float c_ans = (c_temp * 9/5) + 32;
                System.out.println(c_temp + " in fahrenheit is : " + c_ans);
            }

            else if(type == 'B' || type == 'b') {
                System.out.print("\nEnter the temperature in fahrenheit : ");
                float f_temp = sc.nextFloat();

                float f_ans = (f_temp - 32) * 5/9;
                System.out.println(f_temp + " in celsius is : " + f_ans);
            }
        }

        
    }

    static void distance() {

    }

    static void hcf_lcm() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        System.out.println("Want to find :- ");
        System.out.println("A for HCF");
        System.out.println("B for LCM");
        System.out.println("C for Both");
        System.out.println("Enter your option : ");
        char find = input.next().trim().charAt(0);

        if(find == 'A' || find == 'a') {
            int hcf = 0;
            for(int i=1; i<=num1||i<=num2; i++) {
                if(num1%i == 0 && num2%i == 0) {
                    hcf = i;
                }
            }
            System.out.println("The HCF of the number is : " + hcf);
        }

        else if(find == 'B' || find == 'b') {
            int hcf = 0;
            for(int i=1; i<=num1||i<=num2; i++) {
                if(num1%i == 0 && num2%i == 0) {
                    hcf = i;
                }
            }

            int lcm = (num1 * num2) / hcf;
            System.out.println("The LCM of the number is : " + lcm);
        }

        else if(find == 'C' || find == 'c') {
            int hcf = 0;
            for(int i=1; i<=num1||i<=num2; i++) {
                if(num1%i == 0 && num2%i == 0) {
                    hcf = i;
                }
            }
            System.out.println("The HCF of the number is : " + hcf);

            int lcm = (num1 * num2) / hcf;
            System.out.println("The LCM of the number is : " + lcm);
        }
    }

    static void odd_even() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        if(num % 2 == 0) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is not even.");
        }
    }

    static void ele_bill() {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the appliance.");
        System.out.println("A - AC");
        System.out.println("F - Fan");
        System.out.println("H - Heater");
        System.out.print("Enter your appliance : ");
        char app = input.next().trim().charAt(0);

        float k_watt_p = 12;

        if(app == 'a' || app == 'A') {
            float ac_pow_con = 600;
            System.out.print("Enter the hours of use per day : ");
            float ac_hours = input.nextFloat();

            float e_ac = ac_pow_con * ac_hours / 1000;
            float c_ac = e_ac * k_watt_p;
            System.out.println("Electricity cost per day : " + c_ac);
            System.out.println("Electricity cost per month : " + c_ac * 31);
            System.out.println("Electricity cost per year : " + c_ac * 365);
        }

        if(app == 'f' || app == 'F') {
            float fan_pow_con = 70;
            System.out.print("Enter the hours of use per day : ");
            float fan_hours = input.nextFloat();

            float e_fan = fan_pow_con * fan_hours / 1000;
            float c_fan = e_fan * k_watt_p;
            System.out.println("Electricity cost per day : " + c_fan);
            System.out.println("Electricity cost per month : " + c_fan * 31);
            System.out.println("Electricity cost per year : " + c_fan * 365);
        }

        if(app == 'h' || app == 'H') {
            float heat_pow_con = 2000;
            System.out.print("Enter the hours of use per day : ");
            float heat_hours = input.nextFloat();

            float e_heat = heat_pow_con * heat_hours / 1000;
            float c_heat = e_heat * k_watt_p;
            System.out.println("Electricity cost per day : " + c_heat);
            System.out.println("Electricity cost per month : " + c_heat * 31);
            System.out.println("Electricity cost per year : " + c_heat * 365);
        }
    }

    static void simple_inter() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principle amount : ");
        int principle = input.nextInt();

        System.out.print("Enter the rate of the amount : ");
        int rate = input.nextInt();

        System.out.print("Enter the time duration of interest : ");
        int time = input.nextInt();

        // int simple_interest = principle * (1 + rate * time);
        int simple_interest = (principle * time * rate) / 100;
        System.out.println("The interest earned is : " + simple_interest);

        int total_value = simple_interest + principle;
        System.out.println("The total value is : " + total_value);
    }

    static void discount() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the original price : ");
        float org_pr = input.nextFloat();

        System.out.print("Enter the discount percentage : ");
        float dic = input.nextFloat();

        float pe_pic = org_pr * (dic / 100);
        float dic_amt = org_pr - pe_pic;
        System.out.println("The discounted amount is : " + dic_amt);
    }

    static void CGPA() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of subjects : ");
        int num = input.nextInt();

        float gp = 0;
        float gp_add = 0;
        float mar_per = 0;

        for(int i=1; i<=num; i++) {
            System.out.print("Enter the marks of " + i + " subject : ");
            float marks = input.nextFloat();

            if(marks >= 91 && marks <= 100) {
                gp = 10;
            }
            else if(marks >= 81 && marks <= 90) {
                gp = 9;
            }
            else if(marks >= 71 && marks <= 80) {
                gp = 8;
            }
            else if(marks >= 61 && marks <= 70) {
                gp = 7;
            }
            else if(marks >= 51 && marks <= 60) {
                gp = 6;
            }
            else if(marks >= 41 && marks <= 50) {
                gp = 5;
            }
            else if(marks >= 31 && marks <= 40) {
                gp = 4;
            }
            else if(marks >= 21 && marks <= 30) {
                gp = 3;
            }
            else if(marks >= 11 && marks <= 20) {
                gp = 2;
            }
            else if(marks >= 1 && marks <= 10) {
                gp = 1;
            }

            System.out.print("GP of " + i + " subject is : " + gp + "\n");

            gp_add += gp;
            mar_per += marks;
        }

        float CGPA = gp_add / num;
        System.out.println("The CGPA is : " + CGPA);

        float per = (mar_per / num);
        System.out.println("The percentage is : " + per + "%.");
    }

    static void geometry() {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("\nChoose the option among the following.");
            System.out.println("P - Perimeter");
            System.out.println("A - Area");
            System.out.println("V - Volume");
            System.out.println("To exit enter E.");
            System.out.print("Enter the option : ");
            char func = input.next().trim().charAt(0);

            // Area
            if(func == 'a' || func == 'A') {
                System.out.println("\nChoose the shape.");
                System.out.println("C - Circle");
                System.out.println("T - Triangle");
                System.out.println("R - Rectangle");
                System.out.println("I - Isosceles Triangle");
                System.out.println("P - Parallelogram");
                System.out.println("O - Rohmbus");
                System.out.println("E - Equilateral Triangle");
                System.out.print("Enter the option : ");
                char ashape = input.next().trim().charAt(0);
    
                // Circle Area
                if(ashape == 'C' || ashape == 'c') {
                    System.out.println("\nEnter the detail of the circle.");
                    System.out.print("Enter the radius of circle : ");
                    float area_circle_radius = input.nextFloat();
    
                    float area_circle = 3.14f * area_circle_radius * area_circle_radius;
                    System.out.println("The area of the circle is : " + area_circle);
                }

                // Triangle Area
                if(ashape == 'T' || ashape == 't') {
                    System.out.println("\nEnter the detail of the triangle.");
                    System.out.print("Enter the height of the triangle : ");
                    float area_tri_height = input.nextFloat();
                    System.out.print("Enter the base of the triangle : ");
                    float area_tri_base = input.nextFloat();

                    float area_triangle = 0.5f * area_tri_base * area_tri_height;
                    System.out.println("The area of the triangle is : " + area_triangle);
                }

                // Rectangle Area
                if(ashape == 'R' || ashape == 'r') {
                    System.out.println("\nEnter the detail of the rectangle.");
                    System.out.print("Enter the height of the rectangle : ");
                    float area_rec_height = input.nextFloat();
                    System.out.print("Enter the base of the rectangle : ");
                    float area_rec_base = input.nextFloat();

                    float area_rectangle = area_rec_base * area_rec_height;
                    System.out.println("The area of the rectangle is : " + area_rectangle); 
                }

                // Isosceles Triangle Area
                if(ashape == 'I' || ashape == 'i') {
                    System.out.println("\nEnter the detail of the isosceles triangle.");
                    System.out.print("Enter the length of side a : ");
                    float area_itri_a = input.nextFloat();
                    System.out.print("Enter the length of side b : ");
                    float area_itri_b = input.nextFloat();

                    float c = (area_itri_a * area_itri_a - ((area_itri_b * area_itri_b) / 4));
                    float area_isosceles_triangle = (float) (0.5f * area_itri_b * Math.sqrt(c));
                    System.out.println("The area of the isosceles triangle is : " + area_isosceles_triangle);
                }

                // Parallelogram Area
                if(ashape == 'P' || ashape == 'p') {
                    System.out.println("\nEnter the detail of the parallelogram.");
                    System.out.print("Enter the base of the parallelogram : ");
                    float area_par_base = input.nextFloat();
                    System.out.print("Enter the height of the parallelogram : ");
                    float area_par_height = input.nextFloat();

                    float area_parallelogram = area_par_base * area_par_height;
                    System.out.println("The area of the parallelogram is : " + area_parallelogram);
                }

                // Rohmbus Area
                if(ashape == 'O' || ashape == 'o') {
                    System.out.println("\nEnter the detail of the rohmbus.");
                    System.out.print("Enter the one diagonal p : ");
                    float area_rohm_p = input.nextFloat();
                    System.out.print("Enter the another side q : ");
                    float area_rohm_q = input.nextFloat();

                    float area_rohmbus = 0.5f * area_rohm_p * area_rohm_q;
                    System.out.println("The area of the rohmbus is : " + area_rohmbus);
                }

                // Equilateral Triangle Area
                if(ashape == 'E' || ashape == 'e') {
                    System.out.println("\nEnter the detail of the equilateral triangle.");
                    System.out.print("Enter the side of the triangle : ");
                    float area_eqtri_side = input.nextFloat();

                    float area_equ_tri = (1.73f / 4) * area_eqtri_side * area_eqtri_side;
                    System.out.println("The area of the Equilateral Triangle is : " + area_equ_tri);
                }
            }

            // Perimeter
            else if(func == 'p' || func == 'P') {
                System.out.println("\nChoose the shape.");
                System.out.println("C - Circle");
                System.out.println("T - Triangle");
                System.out.println("R - Rectangle");
                System.out.println("I - Isosceles Triangle");
                System.out.println("P - Parallelogram");
                System.out.println("O - Rohmbus");
                System.out.println("E - Equilateral Triangle");
                System.out.print("Enter the option : ");
                char pshape = input.next().trim().charAt(0);

                // Circle Perimeter
                if(pshape == 'C' || pshape == 'c') {
                    System.out.println("\nEnter the detail of the circle.");
                    System.out.print("Enter the radius of circle : ");
                    float peri_circle_radius = input.nextFloat();
    
                    float peri_circle = 2 * 3.14f * peri_circle_radius;
                    System.out.println("The perimeter of the circle is : " + peri_circle);
                }

                // Triangle Perimeter
                if(pshape == 'T' || pshape == 't') {
                    System.out.println("\nEnter the detail of the triangle.");
                    System.out.print("Enter the side a : ");
                    float peri_tri_a = input.nextFloat();
                    System.out.print("Enter the side b : ");
                    float peri_tri_b = input.nextFloat();
                    System.out.print("Enter the side c : ");
                    float peri_tri_c = input.nextFloat();

                    float peri_triangle = peri_tri_a + peri_tri_b + peri_tri_c;
                    System.out.println("The perimeter of the triangle is : " + peri_triangle);
                }

                // Rectangle Perimeter
                if(pshape == 'R' || pshape == 'r') {
                    System.out.println("\nEnter the detail of the rectangle.");
                    System.out.print("Enter the length of the rectangle : ");
                    float peri_rec_length = input.nextFloat();
                    System.out.print("Enter the width of the rectangle : ");
                    float peri_rec_width = input.nextFloat();

                    float peri_rectangle = 2 * (peri_rec_length + peri_rec_width);
                    System.out.println("The perimeter of the rectangle is : " + peri_rectangle); 
                }

                // Isosceles Triangle Perimeter
                if(pshape == 'I' || pshape == 'i') {
                    System.out.println("\nEnter the detail of the isosceles triangle.");
                    System.out.print("Enter the length of side a : ");
                    float peri_itri_a = input.nextFloat();
                    System.out.print("Enter the length of side b : ");
                    float peri_itri_b = input.nextFloat();

                    float peri_iso_tri = (2 * peri_itri_a) + peri_itri_b;
                    System.out.println("The area of the isosceles triangle is : " + peri_iso_tri);
                }

                // Parallelogram Perimeter
                if(pshape == 'P' || pshape == 'p') {
                    System.out.println("\nEnter the detail of the parallelogram.");
                    System.out.print("Enter the side a of the parallelogram : ");
                    float peri_par_a = input.nextFloat();
                    System.out.print("Enter the siperi of the parallelogram : ");
                    float peri_par_b = input.nextFloat();

                    float peri_parallelogram = 2 * (peri_par_a + peri_par_b);
                    System.out.println("The area of the parallelogram is : " + peri_parallelogram);
                }

                // Rohmbus Perimeter
                if(pshape == 'O' || pshape == 'o') {
                    System.out.println("\nEnter the detail of the rohmbus.");
                    System.out.print("Enter the side p of the rohmbus : ");
                    float peri_rohm_a = input.nextFloat();

                    float peri_rohmbus = 4 * peri_rohm_a;
                    System.out.println("The area of the rohmbus is : " + peri_rohmbus);
                }

                // Equilateral Triangle Perimeter
                if(pshape == 'E' || pshape == 'e') {
                    System.out.println("\nEnter the detail of the equilateral triangle.");
                    System.out.print("Enter the side of the triangle : ");
                    float peri_eqtri_side = input.nextFloat();

                    float peri_equ_tri = 3 * peri_eqtri_side;
                    System.out.println("The area of the Equilateral Triangle is : " + peri_equ_tri);
                }
            }

            // Volume
            else if(func == 'V' || func == 'v') {
                System.out.println("\nChoose the shape.");
                System.out.println("C - Circle / Sphere");
                System.out.println("T - Triangle / Pyramid");
                System.out.println("R - Rectangle / Prism");
                System.out.println("I - Isosceles Triangle / Isosceles Pyramid");
                System.out.println("P - Parallelogram / Parallelepiped");
                System.out.println("O - cuboid");
                System.out.println("E - cube");
                System.out.print("Enter the option : ");
                char vshape = input.next().trim().charAt(0);

                // Sphere Volume
                if(vshape == 'C' || vshape == 'c') {
                    System.out.println("\nEnter the detail of the sphere.");
                    System.out.print("Enter the radius of sphere : ");
                    float vol_sphere_radius = input.nextFloat();
    
                    float vol_circle = (4 / 3) * 3.14f * vol_sphere_radius * vol_sphere_radius * vol_sphere_radius;
                    System.out.println("The perimeter of the circle is : " + vol_circle);
                }

                // Pyramid Volume
                if(vshape == 'T' || vshape == 't') {
                    System.out.println("\nEnter the detail of the pyramid.");
                    System.out.print("Enter the length of pyramid : ");
                    float vol_pyr_length = input.nextFloat();
                    System.out.print("Enter the height of pyramid : ");
                    float vol_pyr_height = input.nextFloat();
                    System.out.print("Enter the width of pyramid : ");
                    float vol_pyr_width = input.nextFloat();

                    float vol_pyramid = 0.33f * vol_pyr_height * vol_pyr_length * vol_pyr_width;
                    System.out.println("The perimeter of the triangle is : " + vol_pyramid);
                }

                // Prism Volume
                if(vshape == 'R' || vshape == 'r') {
                    System.out.println("\nEnter the detail of the prism.");
                    System.out.print("Enter the length of prism : ");
                    float vol_prism_length = input.nextFloat();
                    System.out.print("Enter the height of prism : ");
                    float vol_prism_height = input.nextFloat();
                    System.out.print("Enter the width of prism : ");
                    float vol_prism_width = input.nextFloat();

                    float vol_prism = 0.5f * vol_prism_height * vol_prism_length * vol_prism_width;
                    System.out.println("The perimeter of the rectangle is : " + vol_prism); 
                }

                // Isosceles Pyramid Volume
                if(vshape == 'I' || vshape == 'i') {
                    System.out.println("\nEnter the detail of the isosceles pyramid.");
                    System.out.print("Enter the length of pyramid : ");
                    float vol_ipyr_length = input.nextFloat();
                    System.out.print("Enter the height of pyramid : ");
                    float vol_ipyr_height = input.nextFloat();
                    System.out.print("Enter the width of pyramid : ");
                    float vol_ipyr_width = input.nextFloat();

                    float vol_iso_pyramid = 0.33f * vol_ipyr_height * vol_ipyr_length * vol_ipyr_width;
                    System.out.println("The perimeter of the triangle is : " + vol_iso_pyramid);
                }

                // Parallelepiped Volume
                if(vshape == 'P' || vshape == 'p') {
                    System.out.println("\nEnter the detail of the parallelepiped.");
                    System.out.print("Enter the length of parallelepiped : ");
                    float vol_pip_length = input.nextFloat();
                    System.out.print("Enter the height of parallelepiped : ");
                    float vol_pip_height = input.nextFloat();
                    System.out.print("Enter the width of parallelepiped : ");
                    float vol_pip_width = input.nextFloat();

                    float vol_pip = 0.5f * vol_pip_height * vol_pip_length * vol_pip_width;
                    System.out.println("The perimeter of the rectangle is : " + vol_pip); 
                }

                // Cuboid Volume
                if(vshape == 'O' || vshape == 'o') {
                    System.out.println("\nEnter the detail of cuboid.");
                    System.out.print("Enter the length of cuboid : ");
                    float vol_cu_length = input.nextFloat();
                    System.out.print("Enter the height of cuboid : ");
                    float vol_cu_height = input.nextFloat();
                    System.out.print("Enter the breath of cuboid : ");
                    float vol_cu_breath = input.nextFloat();

                    float vol_cuboid = vol_cu_breath * vol_cu_height * vol_cu_length;
                    System.out.println("Tne volume of cuboid is : " + vol_cuboid);
                }

                // Cube Volume 
                if(vshape == 'E' || vshape == 'e') {
                    System.out.println("\nEnter the detail of cube.");
                    System.out.print("Enter the side of cube : ");
                    float vol_cube_side = input.nextFloat();

                    float vol_cube = vol_cube_side * vol_cube_side * vol_cube_side;
                    System.out.println("The volume of cube is : " + vol_cube);
                }
            }

            else if(func == 'E' || func == 'e') {
                break;
            }

            else {
                System.out.println("Invalid input.");
            }
        }
    }

    static void leap() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int year = input.nextInt();
        
        int leap_year = year % 4;

        if(leap_year == 0){
            System.out.println("The entered year is leap year.");
        }
        else{
            System.out.println("It is not a leap year.");
        }
    }

    static void point_distance() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the x1 point : ");
        int x1 = input.nextInt();

        System.out.print("Enter the x2 point : ");
        int x2 = input.nextInt();

        System.out.print("Enter the y1 point : ");
        int y1 = input.nextInt();

        System.out.print("Enter the y2 point : ");
        int y2 = input.nextInt();

        int cal = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        int res = (int) Math.sqrt(cal);
        
        System.out.println("The distance between two points is : " + res);
    }

    static void commission() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount : ");
        float amount = input.nextFloat();

        System.out.print("Enter the commission percentage : ");
        float per = input.nextFloat();

        float ans = amount * (per / 100);

        System.out.println("The commission amount is : " + ans);
    }

    static void depreciation() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the asset amount : ");
        float ase = input.nextFloat();

        System.out.print("Enter the salvage value : ");
        float sal = input.nextFloat();

        System.out.print("Enter the depreciation years : ");
        float dep = input.nextFloat();

        float ans = (ase - sal) / dep;
        System.out.println("The depreciation amount is : " + ans);
    }

    static void batting() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of runs : ");
        int run = input.nextInt();

        System.out.print("Enter the number of innings played : ");
        int inn = input.nextInt();

        System.out.print("Enter the number of times not out : ");
        int nout = input.nextInt();

        float bat_avg = (run / (inn - nout));
        System.out.println("Batting average is : " + bat_avg);
    }

    static void compound() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principle amount : ");
        float p_amt = input.nextFloat();

        System.out.print("Enter the percentage rate : ");
        float rate = input.nextFloat();

        System.out.print("Enter the time : ");
        float time = input.nextFloat();

        float x = 1 + (rate / 100);
        float amt = (float) (p_amt * Math.pow(x, time));

        float CI = amt - p_amt;
        System.out.println("The compound interest is : " + CI);
    }

    static void marks() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of subject : ");
        int num = input.nextInt();

        float sum = 0;

        for(int i=1; i<=num; i++) {
            System.out.print("Enter the marks of " + i + " subject : ");
            float marks = input.nextInt();

            sum += marks;
        }

        float avg = sum / num;
        System.out.println("The average of marks is : " + avg);
    }

    static void pnc() {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the choise of permutation or combination.");
            System.out.println("P - Permutation");
            System.out.println("C - Combination");
            System.out.println("E - Exit");
            System.out.print("Enter your option : ");
            char sel = input.next().trim().charAt(0);
    
            if(sel == 'P' || sel == 'p') {
                System.out.print("Enter total number of elements : ");
                int p_ele = input.nextInt();
    
                System.out.print("Enter the elements that has to be arranged : ");
                int p_arr = input.nextInt();
    
                int p1 = 1;
                for(int i=1; i<=p_ele; i++) {
                    p1 = p1 * i; // Factorial
                }
    
                int den1 = p_ele - p_arr;
                int p2 = 1;
                for(int i=1; i<=den1; i++) {
                    p2 = p2 * i;
                }
    
                int per = p1 / p2;
                System.out.println("Permutation is : " + per);
            }
    
            else if(sel == 'C' || sel == 'c') {
                System.out.print("Enter total number of elements : ");
                int c_ele = input.nextInt();
    
                System.out.print("Enter the elements to be selected : ");
                int c_sel = input.nextInt();
    
                int c1 = 1;
                for(int i=1; i<=c_ele; i++) {
                    c1 = c1 * i;
                }
                System.out.println("c1 = " + c1);
    
                int den2 = c_ele - c_sel;
                int c2 = 1;
                for(int i=1; i<=den2; i++) {
                    c2 = c2 * i;
                }
                System.out.println("c2 = " + c2);
    
                int r = 1;
                for(int i=1; i<=c_sel; i++) {
                    r = r * i;
                }
                System.out.println("r = " + r);
    
                int d_com = c2 * r;
                int com = c1 / d_com;
                System.out.println("Combination is : " + com);
            }

            else if(sel == 'E' || sel == 'e') {
                break;
            }

            else {
                System.out.println("Invalid Input.");
            }
        }
    }

    static void vovels() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = input.nextLine();

        int len = str.length();
        String vowel = "";
        String conso = "";

        for(int i=0; i<len; i++) {
            char vol = str.charAt(i);
            if(vol == 'a' || vol == 'e' || vol == 'i' || vol == 'o' || vol == 'n' || vol == 'A' || vol == 'E' || vol == 'I' || vol == 'O' || vol == 'N') {
                vowel += vol;
            }
            else {
                conso += vol;
            }
        }
        System.out.println("The vowels are : " + vowel);
        System.out.println("The consonents are : " + conso);
    }

    static void perfect() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int sum = 0;
        for(int i=1; i<num; i++) {
            if(num%i == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the factorial of number is : " + sum);

        if(sum == num) {
            System.out.println("Perfect number.");
        }
        else {
            System.out.println("Not a perfect number.");
        }
    }

    static void sum_of_digit() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int sum = 0, rem;
        while(num > 0) {
            rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        System.out.println("The sum of the number is : " + sum);
    }

    static void two_matrix_add() {
        Scanner sc = new Scanner(System.in);
        int [][] mat1;
        int [][] mat2;
        int [][] sum;
        mat1 = new int [2][3];
        mat2 = new int [2][3];
        sum = new int [2][3];

        System.out.println("Enter the element of matrix 1 :- ");
        for (int i=0; i<mat1.length; i++){
            for (int j=0; j<=mat1.length; j++){
                System.out.printf("Enter the element at [%d,%d] matrix 1 : ", i, j);
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter the element of matrix 2 :- ");
        for (int a=0; a<mat2.length; a++){
            for (int b=0; b<=mat2.length; b++){
                System.out.printf("Enter the element at [%d,%d] matrix 2 : ", a, b);
                mat2[a][b] = sc.nextInt();
            }
        }

        System.out.println("\nElements at matrix 1 :-");
        for (int k=0; k<mat1.length; k++){
            for (int l=0; l<=mat1.length; l++){
                System.out.printf("Element at [%d,%d] is in martrix 1 : ", k, l);
                System.out.println(mat1[k][l]);
            }
        }

        System.out.println("\nElements at matrix 2 :-");
        for (int c=0; c<mat2.length; c++){
            for (int d=0; d<=mat2.length; d++){
                System.out.printf("Element at [%d,%d] is in martrix 2 : ", c, d);
                System.out.println(mat2[c][d]);
            }
        }

        System.out.println("\nSum of the martix is :- ");
        for (int m=0; m<sum.length; m++){
            for (int n=0; n<=sum.length; n++){
                sum[m][n] = mat1[m][n] + mat2[m][n];
                System.out.print(sum[m][n]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    static void income_tax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Income Tax");
        System.out.println("Enter your income : ");
        float income = sc.nextFloat();
        float tax = 0;

        if (income<=2.5f){
            System.out.println("No Income tax");
            tax = tax + 0;
        }
        else if (income>2.5f && income<5){
            System.out.println("Income tax is 5%");
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income>5 && income<10){
            System.out.println("Income tax is 20%");
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income>10){
            System.out.println("Income tax is 30%");
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("Tax amount is : ");
        System.out.println(tax);
    }

    static void web_type() {
        Scanner website = new Scanner(System.in);
        System.out.println("Site Type.");
        System.out.println("Enter the website url : ");
        String web = website.nextLine();

        if(web.endsWith(".com")){
            System.out.println("Entered website is commercial website.");
        }
        else if(web.endsWith(".org")){
            System.out.println("Entered website is organizational website.");
        }
        else if(web.endsWith(".in")){
            System.out.println("Entered website is Indian website.");
        }
    }

    static void table() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the to print that table : ");
        int num = sc.nextInt();

        System.out.println("Table is : ");
        for (int i=1; i<=10; i++){
            int mul = num * i;
            System.out.print(num); 
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(mul);
            // System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
        
        System.out.println("Table in reverse order : ");
        for (int i=10; i>=0; i--){
            int mul = num * i;
            System.out.print(num); 
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(mul);
            // System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
    }

    static void rock_paper_game() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock Paper & Scissor game.");

        System.out.println("0 means Rock");
        System.out.println("1 means Paper");
        System.out.println("2 means Scissor");
        System.out.println("\nEnter your choice : ");

        int input = sc.nextInt();

        System.out.println("Your Choice : ");
        if (input == 0) {
            System.out.println("Rock");
        }
        else if (input == 1){
            System.out.println("Paper");
        }
        else if (input == 2){
            System.out.println("Scissor");
        }

        Random numgen = new Random();

        System.out.println("\nComputer Choice : ");
        int randomNumber = numgen.nextInt(3);
        System.out.println(randomNumber);

        if (randomNumber == 0) {
            System.out.println("Rock");
        }
        else if (randomNumber == 1){
            System.out.println("Paper");
        }
        else if (randomNumber == 2){
            System.out.println("Scissor");
        }

        System.out.println("\nResult : ");

        if (input == randomNumber) {
            System.out.println("Its a tie.");
        }
        else if (input == 0 && randomNumber == 1) {
            System.out.println("You Loss!");
            System.out.println("Paper cover Rock");
        }
        else if (input == 0 && randomNumber == 2) {
            System.out.println("You Won!");
            System.out.println("Rock break Scissor");
        }
        else if (input == 1 && randomNumber == 0) {
            System.out.println("You Won!");
            System.out.println("Paper Cover Rock");
        }
        else if (input == 1 && randomNumber == 2) {
            System.out.println("You Loss!");
            System.out.println("Scissor cuts Paper");
        }
        else if (input == 2 && randomNumber == 0) {
            System.out.println("You Loss!");
            System.out.println("Rock break Scissor");
        }
        else if (input == 2 && randomNumber == 1) {
            System.out.println("You Won!");
            System.out.println("Scissor cut Paper");
        }
        System.out.println("\n");
    }
}
