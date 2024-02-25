public class CostePersonal {
    static float CosteDelPersonal(Trabajador trabajadores[]) {
        float costeFinal = 0;
        Trabajador trabajador;
        for (Trabajador trabajador1 : trabajadores) {
            trabajador = trabajador1;
            if (trabajador.getTipoTrabajador() == Trabajador.DIRECTOR || trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR) {
                costeFinal += trabajador.getNomina();
            } else {
                costeFinal = getCosteFinal(costeFinal, trabajador);
            }
        }
        return costeFinal;
    }

    private static float getCosteFinal(float costeFinal, Trabajador trabajador) {
        costeFinal += trabajador.getNomina() + (trabajador.getHorasExtras() * 20);
        return costeFinal;
    }
}
