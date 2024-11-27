/*    */ package com.example.addon;
/*    */ import com.example.addon.commands.CommandExample;
/*    */ import com.example.addon.modules.GravityGuard;
/*    */ import com.example.addon.modules.InfAnchor;
/*    */ import com.example.addon.modules.Retaliate;
/*    */ import com.example.addon.modules.TotemBypass;
/*    */ import meteordevelopment.meteorclient.addons.GithubRepo;
/*    */ import meteordevelopment.meteorclient.addons.MeteorAddon;
/*    */ import meteordevelopment.meteorclient.commands.Commands;
/*    */ import meteordevelopment.meteorclient.systems.hud.HudGroup;
/*    */ import meteordevelopment.meteorclient.systems.modules.Category;
/*    */ import meteordevelopment.meteorclient.systems.modules.Module;
/*    */ import meteordevelopment.meteorclient.systems.modules.Modules;
/*    */ import org.slf4j.Logger;
/*    */ 
/*    */ public class AddonTemplate extends MeteorAddon {
/* 17 */   public static final Logger LOG = LogUtils.getLogger();
/* 18 */   public static final Category CATEGORY = new Category("Example");
/* 19 */   public static final HudGroup HUD_GROUP = new HudGroup("Example");
/*    */ 
/*    */   
/*    */   public void onInitialize() {
/* 23 */     LOG.info("Initializing Meteor Addon Template");
/*    */ 
/*    */     
/* 26 */     Modules.get().add((Module)new ModuleExample());
/* 27 */     Modules.get().add((Module)new TotemBypass());
/* 28 */     Modules.get().add((Module)new InfAnchor());
/* 29 */     Modules.get().add((Module)new GravityGuard());
/* 30 */     Modules.get().add((Module)new MaceExploit());
/* 31 */     Modules.get().add((Module)new Retaliate());
/* 32 */     Modules.get().add((Module)new PaperReach());
/* 33 */     Commands.add((Command)new CommandExample());
/*    */ 
/*    */     
/* 36 */     Hud.get().register(HudExample.INFO);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onRegisterCategories() {
/* 41 */     Modules.registerCategory(CATEGORY);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getPackage() {
/* 46 */     return "com.example.addon";
/*    */   }
/*    */ 
/*    */   
/*    */   public GithubRepo getRepo() {
/* 51 */     return new GithubRepo("MeteorDevelopment", "meteor-addon-template");
/*    */   }
/*    */ }


/* Location:              C:\Users\rajsu\Downloads\vaclient.1.21.30.2.jar!\com\example\addon\AddonTemplate.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */