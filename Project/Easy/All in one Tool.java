import java.util.Scanner;

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
        System.out.print("Enter your choice : ");
        // char process = input.next().trim().charAt(0);
        int process = input.nextInt();

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
            oddeven();
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

    static void oddeven() {
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

}
