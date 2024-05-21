package accesoUsuario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccesoUsuarioTest {

	@Test
	void testAccesoUsuario() {
		boolean resultado;
		try {
			AccesoUsuario ac = new AccesoUsuario();
			resultado=true;
		} catch (Exception e) {
			resultado=false;
		}
		assertTrue(resultado);
	}

	 @Test
    public void testGetId() {
        Long id = 123L;
		AccesoUsuario ac = new AccesoUsuario();
        ac.setId(id);
        assertEquals(id, ac.getId());
    }

    @Test
    public void testGetNombre() {
        String nombre = "Juan Perez";
		AccesoUsuario ac = new AccesoUsuario();
        ac.setNombre(nombre);
        assertEquals(nombre, ac.getNombre());
    }

    @Test
    public void usuarioExiste(){
    	boolean resultado;
    	AccesoUsuario ac1 = new AccesoUsuario();
    	AccesoUsuario ac2 = new AccesoUsuario();
    	
    	ac1.setId(12L);
    	ac1.setNombre("Juanjo");
    	
    	ac2.setId(12L);
    	ac2.setNombre("Juanjo");
    	assertTrue(ac1.equals(ac2));
    }
    
    @Test
    public void usuarioNoExiste(){
    	boolean resultado;
    	AccesoUsuario ac1 = new AccesoUsuario();
    	AccesoUsuario ac2 = new AccesoUsuario();
    	
    	ac1.setId(12L);
    	ac1.setNombre("Juanjo");
    	
    	ac2.setId(11L);
    	ac2.setNombre("Juanjo");
    	assertFalse(ac1.equals(ac2));
    }
    
    @Test
    public void hashTrue() {
    	
    	AccesoUsuario ac1 = new AccesoUsuario();
    	AccesoUsuario ac2 = new AccesoUsuario();
    	
    	ac1.setId(12L);
    	ac1.setNombre("Juanjo");
    	
    	ac2.setId(12L);
    	ac2.setNombre("Juanjo");
    	
    	assertTrue(ac1.equals(ac2) && ac2.equals(ac1));
        assertEquals(ac1.hashCode(), ac2.hashCode());
    }
    
}
