/*    */ package com.example.addon.modules;
/*    */ import com.example.addon.AddonTemplate;
/*    */ import meteordevelopment.meteorclient.events.render.Render3DEvent;
/*    */ import meteordevelopment.meteorclient.settings.ColorSetting;
/*    */ import meteordevelopment.meteorclient.settings.DoubleSetting;
/*    */ import meteordevelopment.meteorclient.settings.Setting;
/*    */ import meteordevelopment.meteorclient.settings.SettingGroup;
/*    */ import meteordevelopment.meteorclient.systems.modules.Module;
/*    */ import meteordevelopment.meteorclient.utils.render.color.Color;
/*    */ import meteordevelopment.meteorclient.utils.render.color.SettingColor;
/*    */ import net.minecraft.class_2338;
/*    */ import net.minecraft.class_238;
/*    */ 
/*    */ public class Retaliate extends Module {
/* 15 */   private final SettingGroup sgGeneral = this.settings.getDefaultGroup();
/* 16 */   private final SettingGroup sgRender = this.settings.createGroup("Render");
/*    */ 
/*    */   
/* 19 */   private final Setting<Double> range = this.sgGeneral.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)(new DoubleSetting.Builder())
/* 20 */       .name("range"))
/* 21 */       .description("Sets the range of the module."))
/* 22 */       .defaultValue(10.0D)
/* 23 */       .range(1.0D, 100.0D)
/* 24 */       .build());
/*    */ 
/*    */ 
/*    */   
/* 28 */   private final Setting<SettingColor> color = this.sgRender.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)(new ColorSetting.Builder())
/* 29 */       .name("InstaKill Height"))
/* 30 */       .description("Color for the height marker"))
/* 31 */       .defaultValue(Color.BLACK)
/* 32 */       .build());
/*    */ 
/*    */ 
/*    */   
/*    */   public Retaliate() {
/* 37 */     super(AddonTemplate.CATEGORY, "Retaliate", "Attacks any entity that harms you");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @EventHandler
/*    */   private void onRender3d(Render3DEvent event) {
/* 44 */     class_238 marker = new class_238(class_2338.field_10980);
/* 45 */     marker.method_1012(((Double)this.range
/* 46 */         .get()).doubleValue() * marker.method_17939(), ((Double)this.range
/* 47 */         .get()).doubleValue() * marker.method_17940(), ((Double)this.range
/* 48 */         .get()).doubleValue() * marker.method_17941());
/*    */   }
/*    */ }


/* Location:              C:\Users\rajsu\Downloads\vaclient.1.21.30.2.jar!\com\example\addon\modules\Retaliate.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */