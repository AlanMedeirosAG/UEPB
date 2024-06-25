package tests;
import models.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class TesteCadastrarFuncionario {

    @Test
    public void TestCadastraFuncionario(){
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        Funcionario funcionario1 = new Funcionario("Alberto", 001);
        funcionarios.add(funcionario1);

        assertTrue(funcionarios.contains(funcionario1));
    }

}