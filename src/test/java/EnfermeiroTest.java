import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EnfermeiroTest {

    @Test
    void deveRetornarHoraPlantaoComTecnico() {
        Plantao plantao = new Tecnico();
        Enfermeiro enfermeiro = new Enfermeiro(12.0f);
        enfermeiro.setPlantao(plantao);
        assertEquals(24.0f, enfermeiro.calcularPlantao(), 12.0f);
    }

    @Test
    void deveRetornarHoraPlantaoComDoutor() {
        Plantao plantao = new Doutor();
        Medico medico = new Medico(12.0f);
        medico.setPlantao(plantao);
        assertEquals(36.0f, medico.calcularPlantao(), 12.0f);
    }
}