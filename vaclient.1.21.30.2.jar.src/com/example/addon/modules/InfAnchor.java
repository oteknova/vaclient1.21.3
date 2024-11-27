/*    */ package com.example.addon.modules;
/*    */ import meteordevelopment.meteorclient.events.render.Render3DEvent;
/*    */ import meteordevelopment.meteorclient.settings.ColorSetting;
/*    */ import meteordevelopment.meteorclient.settings.DoubleSetting;
/*    */ import meteordevelopment.meteorclient.settings.Setting;
/*    */ import meteordevelopment.meteorclient.settings.SettingGroup;
/*    */ import meteordevelopment.meteorclient.systems.modules.Category;
/*    */ import meteordevelopment.meteorclient.systems.modules.Module;
/*    */ import meteordevelopment.meteorclient.utils.render.color.SettingColor;
/*    */ import net.minecraft.class_2338;
/*    */ import net.minecraft.class_238;
/*    */ 
/*    */ public class InfAnchor extends Module {
/* 14 */   private final SettingGroup sgGeneral = this.settings.getDefaultGroup();
/* 15 */   private final SettingGroup sgRender = this.settings.createGroup("Render");
/*    */ 
/*    */   
/* 18 */   private final Setting<Double> range = this.sgGeneral.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)(new DoubleSetting.Builder())
/* 19 */       .name("range"))
/* 20 */       .description("Sets the range of the module."))
/* 21 */       .defaultValue(10.0D)
/* 22 */       .range(1.0D, 100.0D)
/* 23 */       .build());
/*    */ 
/*    */   
/* 26 */   private final Setting<SettingColor> color = this.sgRender.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)(new ColorSetting.Builder())
/* 27 */       .name("Height"))
/* 28 */       .description("Height"))
/* 29 */       .name("InstaKill Height"))
/* 30 */       .description("Simulates a fall from the highest air gap within 170 blocks"))
/* 31 */       .build());
/*    */ 
/*    */ 
/*    */   
/*    */   public InfAnchor() {
/* 36 */     super(AddonTemplate.CATEGORY, "InfAnchor", "Make big boom boom");
/*    */   }
/*    */   
/*    */   public InfAnchor(Category category, String name, String description, String... aliases) {
/* 40 */     super(category, name, description, aliases);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @EventHandler
/*    */   private void onRender3d(Render3DEvent event) {
/* 47 */     class_238 marker = new class_238(class_2338.field_10980);
/* 48 */     marker.method_1012(((Double)this.range
/* 49 */         .get()).doubleValue() * marker.method_17939(), ((Double)this.range
/* 50 */         .get()).doubleValue() * marker.method_17940(), ((Double)this.range
/* 51 */         .get()).doubleValue() * marker.method_17941());
/*    */   }
/*    */ }


/* Location:              C:\Users\rajsu\Downloads\vaclient.1.21.30.2.jar!\com\example\addon\modules\InfAnchor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */