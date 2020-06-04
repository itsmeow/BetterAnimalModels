package dev.itsmeow.betteranimals.client.model;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public abstract class Model<T extends LivingEntity> extends EntityModel<T> {

    public static void setRotateAngleS(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public static void setRotateAngle360S(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = (float) Math.toRadians(x);
        modelRenderer.rotateAngleY = (float) Math.toRadians(y);
        modelRenderer.rotateAngleZ = (float) Math.toRadians(z);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        setRotateAngleS(modelRenderer, x, y, z);
    }

    public void setRotateAngle360(ModelRenderer modelRenderer, float x, float y, float z) {
        setRotateAngle360S(modelRenderer, x, y, z);
    }

    public static float rad(float deg) {
        return deg * (((float) Math.PI) / 180F);
    }

    public static float rad(double deg) {
        return rad((float) deg);
    }

}
