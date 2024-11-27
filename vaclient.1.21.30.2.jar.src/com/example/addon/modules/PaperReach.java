/*    */ package com.example.addon.modules;
/*    */ import com.example.addon.AddonTemplate;
/*    */ import meteordevelopment.meteorclient.events.render.Render3DEvent;
/*    */ import meteordevelopment.meteorclient.settings.ColorSetting;
/*    */ import meteordevelopment.meteorclient.settings.DoubleSetting;
/*    */ import meteordevelopment.meteorclient.settings.Setting;
/*    */ import meteordevelopment.meteorclient.settings.SettingGroup;
/*    */ import meteordevelopment.meteorclient.systems.modules.Category;
/*    */ import meteordevelopment.meteorclient.systems.modules.Module;
/*    */ import meteordevelopment.meteorclient.utils.render.color.SettingColor;
/*    */ import meteordevelopment.orbit.EventHandler;
/*    */ import net.minecraft.class_2338;
/*    */ import net.minecraft.class_238;
/*    */ 
/*    */ public class PaperReach extends Module {
/* 16 */   private final SettingGroup sgGeneral = this.settings.getDefaultGroup();
/* 17 */   private final SettingGroup sgRender = this.settings.createGroup("Render");
/*    */ 
/*    */   
/* 20 */   private final Setting<Double> range = this.sgGeneral.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)(new DoubleSetting.Builder())
/* 21 */       .name("range"))
/* 22 */       .description("Sets the range of the module."))
/* 23 */       .defaultValue(10.0D)
/* 24 */       .range(1.0D, 100.0D)
/* 25 */       .build());
/*    */ 
/*    */ 
/*    */   
/* 29 */   private final Setting<SettingColor> color = this.sgRender.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)(new ColorSetting.Builder())
/* 30 */       .name("InstaKill Height"))
/* 31 */       .description("Color for the height marker"))
/* 32 */       .defaultValue(Color.BLACK)
/* 33 */       .build());
/*    */ 
/*    */ 
/*    */   
/*    */   public PaperReach() {
/* 38 */     super(AddonTemplate.CATEGORY, "PaperReach", "Allows you to reach any block in render distance");
/*    */   }
/*    */   
/*    */   public PaperReach(Category category, String name, String description, String... aliases) {
/* 42 */     super(category, name, description, aliases);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @EventHandler
/*    */   private void onRender3d(Render3DEvent event) {
/* 49 */     class_238 marker = new class_238(class_2338.field_10980);
/* 50 */     marker.method_1012(((Double)this.range
/* 51 */         .get()).doubleValue() * marker.method_17939(), ((Double)this.range
/* 52 */         .get()).doubleValue() * marker.method_17940(), ((Double)this.range
/* 53 */         .get()).doubleValue() * marker.method_17941());
/*    */   }
/*    */ }


/* Location:              C:\Users\rajsu\Downloads\vaclient.1.21.30.2.jar!\com\example\addon\modules\PaperReach.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */