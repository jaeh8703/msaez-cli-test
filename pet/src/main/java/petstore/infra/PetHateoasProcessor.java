package petstore.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import petstore.domain.*;

@Component
public class PetHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Pet>> {

    @Override
    public EntityModel<Pet> process(EntityModel<Pet> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/feed")
                .withRel("feed")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/groom")
                .withRel("groom")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/comb")
                .withRel("comb")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/testa1")
                .withRel("testa1")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/testa2")
                .withRel("testa2")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/testa3")
                .withRel("testa3")
        );

        return model;
    }
}
