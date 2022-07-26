package petstore.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import petstore.domain.*;

@RestController
// @RequestMapping(value="/pets")
@Transactional
public class PetController {

    @Autowired
    PetRepository petRepository;

    @RequestMapping(
        value = "pets/{id}/feed",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Pet feed(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /pet/feed  called #####");
        Optional<Pet> optionalPet = petRepository.findById(id);

        optionalPet.orElseThrow(() -> new Exception("No Entity Found"));
        Pet pet = optionalPet.get();
        pet.feed();

        petRepository.save(pet);
        return pet;
    }

    @RequestMapping(
        value = "pets/{id}/groom",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Pet groom(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /pet/groom  called #####");
        Optional<Pet> optionalPet = petRepository.findById(id);

        optionalPet.orElseThrow(() -> new Exception("No Entity Found"));
        Pet pet = optionalPet.get();
        pet.groom();

        petRepository.save(pet);
        return pet;
    }

    @RequestMapping(
        value = "pets/{id}/comb",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Pet comb(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /pet/comb  called #####");
        Optional<Pet> optionalPet = petRepository.findById(id);

        optionalPet.orElseThrow(() -> new Exception("No Entity Found"));
        Pet pet = optionalPet.get();
        pet.comb();

        petRepository.save(pet);
        return pet;
    }

    @RequestMapping(
        value = "pets/{id}/test2",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Pet test2(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /pet/test2  called #####");
        Optional<Pet> optionalPet = petRepository.findById(id);

        optionalPet.orElseThrow(() -> new Exception("No Entity Found"));
        Pet pet = optionalPet.get();
        pet.test2();

        petRepository.save(pet);
        return pet;
    }

    @RequestMapping(
        value = "pets/{id}/test3",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Pet test3(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /pet/test3  called #####");
        Optional<Pet> optionalPet = petRepository.findById(id);

        optionalPet.orElseThrow(() -> new Exception("No Entity Found"));
        Pet pet = optionalPet.get();
        pet.test3();

        petRepository.save(pet);
        return pet;
    }

    @RequestMapping(
        value = "pets/{id}/test5",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Pet test5(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /pet/test5  called #####");
        Optional<Pet> optionalPet = petRepository.findById(id);

        optionalPet.orElseThrow(() -> new Exception("No Entity Found"));
        Pet pet = optionalPet.get();
        pet.test5();

        petRepository.save(pet);
        return pet;
    }

    @RequestMapping(
        value = "pets/{id}/test6",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Pet test6(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /pet/test6  called #####");
        Optional<Pet> optionalPet = petRepository.findById(id);

        optionalPet.orElseThrow(() -> new Exception("No Entity Found"));
        Pet pet = optionalPet.get();
        pet.test6();

        petRepository.save(pet);
        return pet;
    }

    @RequestMapping(
        value = "pets/{id}/test7",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Pet test7(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /pet/test7  called #####");
        Optional<Pet> optionalPet = petRepository.findById(id);

        optionalPet.orElseThrow(() -> new Exception("No Entity Found"));
        Pet pet = optionalPet.get();
        pet.test7();

        petRepository.save(pet);
        return pet;
    }

    @RequestMapping(
        value = "pets/{id}/test8",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Pet test8(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /pet/test8  called #####");
        Optional<Pet> optionalPet = petRepository.findById(id);

        optionalPet.orElseThrow(() -> new Exception("No Entity Found"));
        Pet pet = optionalPet.get();
        pet.test8();

        petRepository.save(pet);
        return pet;
    }

    @RequestMapping(
        value = "pets/{id}/test10",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Pet test10(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /pet/test10  called #####");
        Optional<Pet> optionalPet = petRepository.findById(id);

        optionalPet.orElseThrow(() -> new Exception("No Entity Found"));
        Pet pet = optionalPet.get();
        pet.test10();

        petRepository.save(pet);
        return pet;
    }

    @RequestMapping(
        value = "pets/{id}/test11",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Pet test11(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /pet/test11  called #####");
        Optional<Pet> optionalPet = petRepository.findById(id);

        optionalPet.orElseThrow(() -> new Exception("No Entity Found"));
        Pet pet = optionalPet.get();
        pet.test11();

        petRepository.save(pet);
        return pet;
    }
    // keep
}
