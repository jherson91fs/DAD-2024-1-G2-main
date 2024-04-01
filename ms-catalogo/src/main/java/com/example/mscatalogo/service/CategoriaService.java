package com.example.mscatalogo.service;

import com.example.mscatalogo.entity.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CategoriaService {

     public List<Categoria> listar();

     public Categoria guardar(Categoria categoria);

     public Optional<Categoria> listarporId(Integer id);

     public Categoria actualizar(Categoria categoria);

     public void eliminar(Integer id);

}



