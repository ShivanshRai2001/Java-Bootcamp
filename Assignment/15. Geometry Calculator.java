import java.util.Scanner;
import java.lang.Math;

public class Practice1 {
    public static void main(String[] args) {
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
