public class Rectangulo {

    public int[] A,B,C ; // Aqui son guardados los puntos, A[0] = Ax y A[1] = Ay.

    int Ax,Ay,Aw,Ah;
        // Constructor que crea un objeto con su punto x , y , ancho y altura
        public Rectangulo(int x, int y, int w,int h)
        {
            this.Ax = x;
            this.Ay = y;
            this.Aw = w;
            this.Ah = h;
        }

    public boolean existeColision(Rectangulo A, Rectangulo B){
            //Condiciones> necesarias para saber si un rectangulo colisiona o choca con otro en algun otro
            //contexto no lo hace
        return
                        B.Ax + B.Aw > A.Ax &&
                        B.Ay + B.Ah > A.Ay &&
                        A.Ax + A.Aw > B.Ax &&
                        A.Ay + A.Ah > B.Ay;
    }
}
