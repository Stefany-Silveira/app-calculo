module app.calculo {

    requires transitive app.logging;
    exports br.com.stefany.app.calculo;

    exports br.com.stefany.app.calculo.interno
            to app.financeiro;

    opens br.com.stefany.app.calculo to app.logging, app.financeiro;
}