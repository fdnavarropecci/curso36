public class App{
	
	public static void main(String argv[])
	{
    	Estudiante e1 = new Estudiante("Eugenio","201700254");
    	
        System.out.println(e1);
        System.out.println("____________________________");

        Profesor p1 = new Profesor("Eugenio","103489-1723489-1720384717");

        System.out.println("Son iguales o distintos: " + p1.compareTo(e1));

        if(p1.equals(e1))
        {
            System.out.println("Son iguales");
        }
        else
            System.out.println("Son distintos");

        System.out.println(p1);
        System.out.println("____________________________");


        Trabajador t1 = new Profesor("PEPE", "123123");
        int[] plantas = {1,3};
        Trabajador t2 = new Bedel("Paco","103489-1723489-1720384717", plantas);


    	Persona [] personas = new Persona[10];

    	personas[0] = e1;
    	personas[1] = t1;
        personas[2] = t2;
        personas[3] = p1;

        double sueldos = 0;

    	for(Persona p : personas)
    	{
    		if(p!=null && p instanceof Trabajador)
            {
                Trabajador t = (Trabajador)p;
    			sueldos = sueldos + t.cobrarNomina();
            }
    	}

        System.out.println("Sueldos brutos " + sueldos);

        double sueldosNetos = 0;
        for(Persona p : personas)
        {
            if(p!=null && p instanceof Trabajador)
            {
                Trabajador t = (Trabajador)p;
                sueldosNetos = sueldosNetos + t.calculoConIRPF();
            }
        }

        System.out.println("Sueldos netos " + sueldosNetos);

	}


}