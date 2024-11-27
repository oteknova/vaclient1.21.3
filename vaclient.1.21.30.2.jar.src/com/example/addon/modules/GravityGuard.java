/*    */ package com.example.addon.modules;
/*    */ import meteordevelopment.meteorclient.settings.ColorSetting;
/*    */ import meteordevelopment.meteorclient.settings.DoubleSetting;
/*    */ import meteordevelopment.meteorclient.settings.Setting;
/*    */ import meteordevelopment.meteorclient.settings.SettingGroup;
/*    */ import meteordevelopment.meteorclient.systems.modules.Category;
/*    */ import meteordevelopment.meteorclient.systems.modules.Module;
/*    */ import meteordevelopment.meteorclient.utils.render.color.SettingColor;
/*    */ import meteordevelopment.orbit.EventHandler;
/*    */ import meteordevelopment.starscript.compiler.Expr;
/*    */ import net.minecraft.class_2338;
/*    */ import net.minecraft.class_238;
/*    */ 
/*    */ public class GravityGuard extends Module {
/* 15 */   private final SettingGroup sgGeneral = this.settings.getDefaultGroup();
/* 16 */   private final SettingGroup sgRender = this.settings.createGroup("Render");
/*    */ 
/*    */   
/* 19 */   private final Setting<Double> range = this.sgGeneral.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)(new DoubleSetting.Builder())
/* 20 */       .name("range"))
/* 21 */       .description("How Many packets to send."))
/* 22 */       .defaultValue(10.0D)
/* 23 */       .range(1.0D, 100.0D)
/* 24 */       .build());
/*    */ 
/*    */   
/* 27 */   private final Setting<SettingColor> color = this.sgRender.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)(new ColorSetting.Builder())
/* 28 */       .name("Height"))
/* 29 */       .description("Height"))
/* 30 */       .name("Nofall Color"))
/* 31 */       .description("Cancels the packet. and Shows a cool colour."))
/* 32 */       .build());
/*    */ 
/*    */ 
/*    */   
/*    */   public GravityGuard() {
/* 37 */     super(AddonTemplate.CATEGORY, "GravityGuard", "A Better NoFall");
/*    */   }
/*    */ 
/*    */   
/*    */   public void GravityGuard(Category category, Expr.String name, String description, String... aliases) {}
/*    */   
/*    */   public GravityGuard(Category category, String name, String description, String... aliases) {
/* 44 */     super(category, name, description, aliases);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @EventHandler
/*    */   private void onRender3d(Render3DEvent event) {
/* 51 */     class_238 marker = new class_238(class_2338.field_10980);
/* 52 */     marker.method_1012(((Double)this.range
/* 53 */         .get()).doubleValue() * marker.method_17939(), ((Double)this.range
/* 54 */         .get()).doubleValue() * marker.method_17940(), ((Double)this.range
/* 55 */         .get()).doubleValue() * marker.method_17941());
/*    */   }
/*    */ }


/* Location:              C:\Users\rajsu\Downloads\vaclient.1.21.30.2.jar!\com\example\addon\modules\GravityGuard.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */