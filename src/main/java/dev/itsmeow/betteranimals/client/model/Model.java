package dev.itsmeow.betteranimals.client.model;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.LivingEntity;

public abstract class Model<T extends LivingEntity> extends EntityModel<T> {

    public static void setRotateAngleS(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    public static void setRotateAngle360S(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = (float) Math.toRadians(x);
        modelRenderer.yRot = (float) Math.toRadians(y);
        modelRenderer.zRot = (float) Math.toRadians(z);
    }

    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        setRotateAngleS(modelRenderer, x, y, z);
    }

    public void setRotateAngle360(ModelPart modelRenderer, float x, float y, float z) {
        setRotateAngle360S(modelRenderer, x, y, z);
    }

    public static float rad(float deg) {
        return deg * (((float) Math.PI) / 180F);
    }

    public static float rad(double deg) {
        return rad((float) deg);
    }

}
