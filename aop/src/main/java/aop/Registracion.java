package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.lang.reflect.Method;

@Aspect
public class Registracion {
    @Before("execution(* aop..*.insultarA(..)) || execution(* aop..*.dialogarCon(..))")
    //@Before("execution(@RegistrarInsulto * *(..))")
    public void registrarAntes(JoinPoint joinPoint) {
        String mensaje = (String) joinPoint.getArgs()[1];
        System.out.println("Registrando: " + mensaje);
    }

//    var quienInvoco = joinPoint.getThis();
//    String nombre = null;
//        try {
//        Method metodoGetNombre = quienInvoco.getClass().getMethod("nombre");
//        nombre = (String) metodoGetNombre.invoke(quienInvoco);
//    } catch (Exception e) {
//        nombre = "desconocido";
//    }
//        System.out.println("Registrando: " + nombre + " - " + mensaje);


    //@After("execution(* aop.Jugador.insultarA(..))")
    public void registrarDespues(JoinPoint joinPoint) {
        String mensaje = (String) joinPoint.getArgs()[1];
        System.out.println("Registrando: " + mensaje);
    }

    //@Around("execution(* aop.Jugador.insultarA(..))")
    public void registrarEntre(ProceedingJoinPoint joinPoint) throws Throwable {
        String mensaje = (String) joinPoint.getArgs()[1];
        System.out.println("Antes de la invocación: " + mensaje);

        joinPoint.proceed();

        System.out.println("Después de la invocación: " + mensaje);
    }
}