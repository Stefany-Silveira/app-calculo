module app.calculo {

    requires transitive app.logging;
    exports br.com.stefany.app.calculo;

    exports br.com.stefany.app.calculo.interno
            to app.financeiro;
}