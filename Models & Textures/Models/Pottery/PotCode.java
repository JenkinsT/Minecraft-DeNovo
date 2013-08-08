// Date: 8/8/2013 4:51:15 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelNew extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
  
  public ModelNew()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Shape1 = new ModelRenderer(this, 73, 21);
      Shape1.addBox(0F, 0F, 0F, 10, 7, 10);
      Shape1.setRotationPoint(-5F, 15F, -5F);
      Shape1.setTextureSize(128, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 72, 15);
      Shape2.addBox(0F, 0F, 0F, 8, 3, 8);
      Shape2.setRotationPoint(-4F, 12F, -4F);
      Shape2.setTextureSize(128, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 24);
      Shape3.addBox(0F, 0F, 0F, 6, 2, 6);
      Shape3.setRotationPoint(-3F, 10F, -3F);
      Shape3.setTextureSize(128, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 74, 40);
      Shape4.addBox(0F, 0F, 0F, 8, 1, 8);
      Shape4.setRotationPoint(-4F, 22F, -4F);
      Shape4.setTextureSize(128, 128);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 22, 23);
      Shape5.addBox(0F, 0F, 0F, 5, 1, 5);
      Shape5.setRotationPoint(-2.5F, 23F, -2.5F);
      Shape5.setTextureSize(128, 128);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}