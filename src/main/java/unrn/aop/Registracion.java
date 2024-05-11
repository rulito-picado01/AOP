package unrn.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Registracion {
    @Before("execution(* unrn.aop.Jugador.insultarA(..))")
    public void registrarAntes(JoinPoint joinPoint) {
        Jugador unJugador = (Jugador) joinPoint.getThis();
        Arbitro unArbitro = (Arbitro) joinPoint.getArgs()[0];
        String insulto = (String) joinPoint.getArgs()[1];

        System.out.print("Registración: El jugador "
                + unJugador.nombre()
                + " le va a decir " + insulto
                + " al árbitro " + unArbitro.nombre());
    }

    @After("execution(* unrn.aop.Jugador.insultarA(..))")
    public void registrarDespues(JoinPoint joinPoint) {
        Jugador unJugador = (Jugador) joinPoint.getThis();
        Arbitro unArbitro = (Arbitro) joinPoint.getArgs()[0];
        String insulto = (String) joinPoint.getArgs()[1];

        System.out.print("Registración: El jugador "
                + unJugador.nombre()
                + " le dijo " + insulto
                + " al árbitro " + unArbitro.nombre());
    }

    
//    @Before("@annotation(BlaAnnotation)")
//    public void withAnnotation() {
//        System.out.println("@ aspecto");
//    }
}