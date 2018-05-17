package com.mycorp;

import com.mycorp.soporte.BeneficiarioPolizas;
import com.mycorp.soporte.ProductoPolizas;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import wscontratacion.contratacion.fuentes.parametros.DatosAlta;

import java.util.List;
import java.util.Map;


/**
 * Unit test for simple App.
 */
public class RealizarSimulacionTest extends TestCase {

    @InjectMocks
    RealizarSimulacion realizarSimulacion;

    DatosAlta oDatosAlta;
    List< ProductoPolizas > lProductos;
    List<BeneficiarioPolizas> lBeneficiarios;
    boolean desglosar;
    Map< String, Object > hmValores;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    /**
     * Rigourous Test :-)
     */
    @Test(expected = Exception.class)
    public void testApp() throws Exception {
        realizarSimulacion.realizarSimulacion(oDatosAlta, lProductos,lBeneficiarios, desglosar, hmValores);
        assertTrue( true );
    }

}
