package ezwowm.ezwowm.services;

import ezwowm.ezwowm.dto.UsuarioDTO;
import ezwowm.ezwowm.model.Usuario;
import ezwowm.ezwowm.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
    private static final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
    this.usuarioRepository = usuarioRepository;
    }

    public List<UsuarioDTO> devolverUsuarios(){  //Works
        //List<Usuario> listaDeRepo = usuarioRepository.getUsuarios();
        //return convertToDTOList(listaDeRepo);
        return null;
    }
    private List<UsuarioDTO> convertToDTOList(List<Usuario> userList) {
        return userList.stream()
                .map(user -> modelMapper.map(user, UsuarioDTO.class))
                .collect(Collectors.toList());
    }

}
