package org.example.Aplication.Services;


import org.example.Domain.Paciente;
import org.example.Interfaces.PacientesRepository;

import java.util.List;

public class PacienteService {

    private final PacientesRepository repository;

    public PacienteService(PacientesRepository repository) {
        this.repository = repository;
    }


    public void crear(Paciente paciente) {
        repository.save(paciente);
    }

    public List<Paciente> listarPacientes() {
        return repository.findAll();
    }

    public void eliminarPaciente(int id) {
        repository.delete(id);
    }

    public Paciente buscarPacientePorId(int id) {
        return repository.findById(id);
    }

    public void actualizarPaciente(Paciente paciente) {
        repository.update(paciente);
    }

}