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
                .of(model.getRequiredLink("self").getHref() + "/test2")
                .withRel("test2")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/test3")
                .withRel("test3")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/test5")
                .withRel("test5")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/test6")
                .withRel("test6")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/test7")
                .withRel("test7")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/test8")
                .withRel("test8")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/test11")
                .withRel("test11")
        );

        return model;
    }
}
