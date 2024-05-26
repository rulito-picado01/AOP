package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Registracion {
    @Before("execution(* aop.Jugador.insultarA(..))")
    //@Before("execution(@Registrar * *(..))")
    public void registrarAntes(JoinPoint joinPoint) {
        Jugador unJugador = (Jugador) joinPoint.getThis();
        Arbitro unArbitro = (Arbitro) joinPoint.getArgs()[0];
        String insulto = (String) joinPoint.getArgs()[1];

        System.out.println("Registración: El jugador "
                + unJugador.nombre()
                + " le va a decir " + insulto
                + " al árbitro " + unArbitro.nombre());
    }

    //@After("execution(* aop.Jugador.insultarA(..))")
    public void registrarDespues(JoinPoint joinPoint) {
        Jugador unJugador = (Jugador) joinPoint.getThis();
        Arbitro unArbitro = (Arbitro) joinPoint.getArgs()[0];
        String insulto = (String) joinPoint.getArgs()[1];

        System.out.println("Registración: El jugador "
                + unJugador.nombre()
                + " le dijo " + insulto
                + " al árbitro " + unArbitro.nombre());
    }

    //@Around("execution(* aop.Jugador.insultarA(..))")
    public void registrarDespues(ProceedingJoinPoint joinPoint) throws Throwable {
        Jugador unJugador = (Jugador) joinPoint.getThis();
        Arbitro unArbitro = (Arbitro) joinPoint.getArgs()[0];
        String insulto = (String) joinPoint.getArgs()[1];
        System.out.println("Antes de la invocación: El jugador " + unJugador.nombre()
                + " le va a decir " + insulto
                + " al árbitro " + unArbitro.nombre());

        joinPoint.proceed();

        System.out.println("Después de la invocación: El jugador " + unJugador.nombre()
                + " le dijo " + insulto
                + " al árbitro " + unArbitro.nombre());
    }
}