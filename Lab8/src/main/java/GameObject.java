public abstract class GameObject {
    protected RenderObject renderobject;

    protected GameObject(RenderObject renderobject){
        this.renderobject=renderobject;
    }
    public abstract void render();
}
