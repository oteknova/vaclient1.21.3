/*    */ package com.example.addon.modules;
/*    */ import meteordevelopment.meteorclient.events.render.Render3DEvent;
/*    */ import meteordevelopment.meteorclient.settings.ColorSetting;
/*    */ import meteordevelopment.meteorclient.settings.DoubleSetting;
/*    */ import meteordevelopment.meteorclient.settings.Setting;
/*    */ import meteordevelopment.meteorclient.settings.SettingGroup;
/*    */ import meteordevelopment.meteorclient.systems.modules.Module;
/*    */ import meteordevelopment.meteorclient.utils.render.color.SettingColor;
/*    */ import net.minecraft.class_2338;
/*    */ import net.minecraft.class_238;
/*    */ 
/*    */ public class ModuleExample extends Module {
/* 13 */   private final SettingGroup sgGeneral = this.settings.getDefaultGroup();
/* 14 */   private final SettingGroup sgRender = this.settings.createGroup("Render");
/*    */ 
/*    */   
/* 17 */   private final Setting<Double> range = this.sgGeneral.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)(new DoubleSetting.Builder())
/* 18 */       .name("range"))
/* 19 */       .description("Sets the range of the module."))
/* 20 */       .defaultValue(10.0D)
/* 21 */       .range(1.0D, 100.0D)
/* 22 */       .build());
/*    */ 
/*    */   
/* 25 */   private final Setting<SettingColor> color = this.sgRender.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)(new ColorSetting.Builder())
/* 26 */       .name("Height"))
/* 27 */       .description("Height"))
/* 28 */       .name("InstaKill Height"))
/* 29 */       .description("Simulates a fall from the highest air gap within 170 blocks"))
/* 30 */       .build());
/*    */ 
/*    */ 
/*    */   
/*    */   public ModuleExample() {
/* 35 */     super(AddonTemplate.CATEGORY, "MaceTPAura", "Teleports and attacks players in range.");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @EventHandler
/*    */   private void onRender3d(Render3DEvent event) {
/* 42 */     class_238 marker = new class_238(class_2338.field_10980);
/* 43 */     marker.method_1012(((Double)this.range
/* 44 */         .get()).doubleValue() * marker.method_17939(), ((Double)this.range
/* 45 */         .get()).doubleValue() * marker.method_17940(), ((Double)this.range
/* 46 */         .get()).doubleValue() * marker.method_17941());
/*    */   }
/*    */ }


/* Location:              C:\Users\rajsu\Downloads\vaclient.1.21.30.2.jar!\com\example\addon\modules\ModuleExample.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */