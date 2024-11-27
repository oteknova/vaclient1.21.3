/*    */ package com.example.addon.hud;
/*    */ 
/*    */ import com.example.addon.AddonTemplate;
/*    */ import java.util.function.Supplier;
/*    */ import meteordevelopment.meteorclient.systems.hud.HudElement;
/*    */ import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
/*    */ import meteordevelopment.meteorclient.systems.hud.HudRenderer;
/*    */ import meteordevelopment.meteorclient.utils.render.color.Color;
/*    */ 
/*    */ public class HudExample
/*    */   extends HudElement
/*    */ {
/* 13 */   public static final HudElementInfo<HudExample> INFO = new HudElementInfo(AddonTemplate.HUD_GROUP, "example", "HUD element example.", HudExample::new);
/*    */   
/*    */   public HudExample() {
/* 16 */     super(INFO);
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(HudRenderer renderer) {
/* 21 */     setSize(renderer.textWidth("Example element", true), renderer.textHeight(true));
/*    */ 
/*    */     
/* 24 */     renderer.quad(this.x, this.y, getWidth(), getHeight(), Color.LIGHT_GRAY);
/*    */ 
/*    */     
/* 27 */     renderer.text("Example element", this.x, this.y, Color.WHITE, true);
/*    */   }
/*    */ }


/* Location:              C:\Users\rajsu\Downloads\vaclient.1.21.30.2.jar!\com\example\addon\hud\HudExample.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */